package logbook.internal;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import logbook.constants.AppConstants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Quest
 *
 */
public final class QuestTranslated {
    private static final Logger LOG = LogManager.getLogger(QuestTranslated.class);

    private static final Map<String, String> QUESTTITLE = new ConcurrentHashMap<String, String>();
    private static final Map<String, String> QUESTDETAIL = new ConcurrentHashMap<String, String>();
    static {
        try {
            // Populate the HashMap with the translation data
            // Column: Quest Code, titleJP, titleEN, detailJP, detailEN, api_no
            TranslationDto.fillMap(QUESTTITLE, AppConstants.QUEST_TRANSLATION_FILE, 1, 2);
            TranslationDto.fillMap(QUESTDETAIL, AppConstants.QUEST_TRANSLATION_FILE, 3, 4);
        } catch (IOException e) {
            LOG.warn("Failed to read quest translation.", e);
        }
    }

    /**
     * Retrieve the translated title
     * 
     * @param jpname Japanese title
     * @return Translated title
     */
    public static String gettitle(String jpname) {
        return QUESTTITLE.containsKey(jpname) ? QUESTTITLE.get(jpname) : jpname;
    }

    /**
     * Retrieve the translated quest detail
     * 
     * @param jpname Japanese detail
     * @return Translated detail
     */
    public static String getdetail(String jpname) {
        return QUESTDETAIL.containsKey(jpname) ? QUESTDETAIL.get(jpname) : jpname;
    }
}
