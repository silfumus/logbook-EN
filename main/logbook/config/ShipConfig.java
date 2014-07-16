package logbook.config;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import logbook.constants.AppConstants;
import logbook.dto.ShipInfoDto;
import logbook.internal.Ship;
import logbook.util.BeanUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 艦娘のIDと名前の紐付けを保存・復元します
 * 
 */
public class ShipConfig {
    /** ロガー */
    private static final Logger LOG = LogManager.getLogger(ShipConfig.class);

    /**
     * 設定ファイルに書き込みます
     */
    public static void store() throws IOException {
        Set<String> shipids = Ship.keySet();
        Map<String, ShipInfoDto> map = new HashMap<String, ShipInfoDto>();
        for (String key : shipids) {
            ShipInfoDto ship = Ship.get(key);
            map.put(key, ship);
        }
        BeanUtils.writeObject(AppConstants.SHIP_CONFIG_FILE, map);
    }

    /**
     * 艦娘のIDと名前の紐付けを設定ファイルから読み込みます
     * 
     * @param properties
     * @return
     */
    public static void load() {
        try {
            Map<String, ShipInfoDto> map = BeanUtils.readObject(AppConstants.SHIP_CONFIG_FILE, Map.class);
            if (map != null) {
                for (Entry<String, ShipInfoDto> entry : map.entrySet()) {
                    Ship.set(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e) {
            LOG.warn("艦娘のIDと名前の紐付けを設定ファイルから読み込みますに失敗しました", e);
        }
    }
}
