package logbook.internal;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import logbook.constants.AppConstants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Map
 *
 */
public final class MapNames {
    private static final Logger LOG = LogManager.getLogger(MapNames.class);

    /**
     * Map names predefined value
     */
    private static final Map<String, String> MAPNAME = new ConcurrentHashMap<String, String>();

    static {
        try {
            // Populate the HashMap with the translation data
            // Column: Quest Code, titleJP, titleEN, detailJP, detailEN, api_no
            TranslationDto.fillMap(MAPNAME, AppConstants.MAPNAME_TRANSLATION_FILE, 0, 1);
        } catch (IOException e) {
            LOG.warn("Failed to read quest translation.", e);
        }
    }

    /**
     * Get the map code
     * 
     * @param jpname JP Map name
     * @return Map Code
     */
    public static String get(String jpname) {
        return MAPNAME.containsKey(jpname) ? MAPNAME.get(jpname) : jpname;
    }
}
