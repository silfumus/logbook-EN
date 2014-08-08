package logbook.internal;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import logbook.constants.AppConstants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 艦種
 * 
 */
public class ShipStyle {
    private static final Logger LOG = LogManager.getLogger(ShipStyle.class);

    /**
     * 艦種プリセット値
     */
    private static final Map<String, String> SHIPSTYLE = new ConcurrentHashMap<String, String>();
    static {
        try {
            TranslationDto.fillMap(SHIPSTYLE, AppConstants.SHIPSTYLE_TRANSLATION_FILE, 0, 1);
        } catch (IOException e) {
            LOG.warn("Failed to read quest translation.", e);
        }
    }

    /**
     * 艦種を取得します
     * 
     * @param id
     * @return 艦種
     */
    public static String get(String id) {
        return SHIPSTYLE.get(id);
    }
}
