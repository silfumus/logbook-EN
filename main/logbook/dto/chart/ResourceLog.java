package logbook.dto.chart;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.annotation.CheckForNull;

import logbook.config.AppConfig;
import logbook.constants.AppConstants;
import logbook.dto.AbstractDto;

import org.apache.commons.io.LineIterator;

/**
 * 資材ログを表します
 *
 */
public class ResourceLog extends AbstractDto {
    public static final int RESOURCE_FUEL = 0;
    public static final int RESOURCE_AMMO = 1;
    public static final int RESOURCE_METAL = 2;
    public static final int RESOURCE_BAUXITE = 3;
    public static final int RESOURCE_BUCKET = 4;
    public static final int RESOURCE_BURNER = 5;
    public static final int RESOURCE_RESEARCH = 6;

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
        // 日付フォーマット
        SimpleDateFormat format = new SimpleDateFormat(AppConstants.DATE_FORMAT);

        List<SortableLog> logs = new ArrayList<>();
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
                try {
                    Date date = format.parse(colums[0]);
                    SortableLog log = new SortableLog();
                    log.time = date.getTime();
                    log.fuel = Integer.parseInt(colums[1]);
                    log.ammo = Integer.parseInt(colums[2]);
                    log.metal = Integer.parseInt(colums[3]);
                    log.bauxite = Integer.parseInt(colums[4]);
                    log.bucket = Integer.parseInt(colums[5]);
                    log.burner = Integer.parseInt(colums[6]);
                    log.research = Integer.parseInt(colums[7]);
                    logs.add(log);

                } catch (Exception e) {
                    continue;
                }
            }
        }
        // 資材ログが2行以下の場合はグラフを描画出来ないのでnullを返す
        if (logs.size() <= 2) {
            return null;
        }
        // ソート
        Collections.sort(logs);

        long[] time = new long[logs.size()];
        int[] fuel = new int[logs.size()];
        int[] ammo = new int[logs.size()];
        int[] metal = new int[logs.size()];
        int[] bauxite = new int[logs.size()];
        int[] bucket = new int[logs.size()];
        int[] burner = new int[logs.size()];
        int[] research = new int[logs.size()];
        for (int i = 0; i < logs.size(); i++) {
            SortableLog log = logs.get(i);
            time[i] = log.time;
            fuel[i] = log.fuel;
            ammo[i] = log.ammo;
            metal[i] = log.metal;
            bauxite[i] = log.bauxite;
            bucket[i] = log.bucket;
            burner[i] = log.burner;
            research[i] = log.research;
        }
        Resource[] resources = new Resource[] {
                new Resource("Fuel", AppConfig.get().getFuelColor(), fuel),
                new Resource("Ammo", AppConfig.get().getAmmoColor(), ammo),
                new Resource("Steel", AppConfig.get().getMetalColor(), metal),
                new Resource("Bauxite", AppConfig.get().getBauxiteColor(), bauxite),
                new Resource("Instant Repair", null, bucket),
                new Resource("Instant Build", null, burner),
                new Resource("DevMat", null, research)
        };
        return new ResourceLog(time, resources);
    }

    /**
     * 資材ログの行
     */
    public static final class SortableLog implements Comparable<SortableLog> {

        public long time;
        public int fuel;
        public int ammo;
        public int metal;
        public int bauxite;
        public int bucket;
        public int burner;
        public int research;

        @Override
        public int compareTo(SortableLog o) {
            return Long.compare(this.time, o.time);
        }
    }
}
