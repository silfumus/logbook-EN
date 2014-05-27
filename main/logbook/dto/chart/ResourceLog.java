package logbook.dto.chart;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.CheckForNull;

import logbook.dto.AbstractDto;

import org.apache.commons.io.LineIterator;
import org.eclipse.swt.graphics.RGB;

/**
 * 資材ログを表します
 *
 */
public class ResourceLog extends AbstractDto {

    public long[] time;

    public Resource[] resources;

    public ResourceLog(long[] time, Resource[] resources) {
        this.time = time;
        this.resources = resources;
    }

    /**
     * 資材ログを読み込む
     * 
     * @param file 資材ログ
     * @return
     * @throws IOException
     */
    @CheckForNull
    public static ResourceLog getInstance(File file) throws IOException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        List<Long> time = new ArrayList<>();
        List<Integer> fuel = new ArrayList<>();
        List<Integer> ammo = new ArrayList<>();
        List<Integer> metal = new ArrayList<>();
        List<Integer> bauxite = new ArrayList<>();

        // データを読み込む
        try (Reader reader = new BufferedReader(new FileReader(file))) {
            LineIterator ite = new LineIterator(reader);
            // ヘッダーを読み飛ばす
            if (ite.hasNext()) {
                ite.next();
            }
            while (ite.hasNext()) {
                String line = ite.next();
                // 日付,燃料,弾薬,鋼材,ボーキ,高速修復材,高速建造材,開発資材
                String[] colums = line.split(",");
                if (colums.length < 8) {
                    continue;
                }
                try {
                    Date date = format.parse(colums[0]);
                    int ifuel = Integer.parseInt(colums[1]);
                    int iammo = Integer.parseInt(colums[2]);
                    int imetal = Integer.parseInt(colums[3]);
                    int ibauxite = Integer.parseInt(colums[4]);

                    time.add(date.getTime());
                    fuel.add(ifuel);
                    ammo.add(iammo);
                    metal.add(imetal);
                    bauxite.add(ibauxite);

                } catch (Exception e) {
                    continue;
                }
            }
        }

        // 資材ログが2行以下の場合はグラフを描画出来ないのでnullを返す
        if (time.size() <= 2) {
            return null;
        }

        long[] t = new long[time.size()];
        for (int i = 0; i < time.size(); i++) {
            t[i] = time.get(i);
        }
        Resource[] resources = new Resource[] {
                new Resource("Fuel", new RGB(0x00, 0x80, 0x00), fuel),
                new Resource("Ammo", new RGB(0x66, 0x33, 0x00), ammo),
                new Resource("Steel", new RGB(0x80, 0x80, 0x80), metal),
                new Resource("Bauxite", new RGB(0xCC, 0x33, 0x00), bauxite)
        };

        return new ResourceLog(t, resources);
    }
}
