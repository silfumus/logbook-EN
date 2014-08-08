package logbook.internal;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import logbook.constants.AppConstants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 遠征
 *
 */
public final class Deck {
    private static final Logger LOG = LogManager.getLogger(Deck.class);

    /**
     * 遠征プリセット値
     */
    private static final Map<Integer, String> DECK = new ConcurrentHashMap<Integer, String>();

    /**
     * 遠征プリセット値
     */
    private static final Map<String, String> EXPEDITIONNAME = new ConcurrentHashMap<String, String>();

    static {
        try {
            // Populate the HashMap with the translation data
            // Column: Quest Code, titleJP, titleEN, detailJP, detailEN, api_no
            TranslationDto.fillIntMap(DECK, AppConstants.EXPEDITION_TRANSLATION_FILE, 0, 1);
            TranslationDto.fillMap(EXPEDITIONNAME, AppConstants.EXPEDITION_TRANSLATION_FILE, 2, 1);
        } catch (IOException e) {
            LOG.warn("Failed to read quest translation.", e);
        }
    }

    /**
     * 遠征を取得します
     * 
     * @param id ID
     * @return 遠征
     */
    public static String get(int id) {
        return DECK.get(id);
    }

    /**
     * Retrieve the expedition name
     * 
     * @param jpname Japanese name of the expedition
     * @return Translated Name
     */
    public static String getname(String jpname) {
        return EXPEDITIONNAME.containsKey(jpname) ? EXPEDITIONNAME.get(jpname) : jpname;
    }
}
