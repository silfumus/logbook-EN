package logbook.dto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;

import javax.annotation.CheckForNull;

import org.apache.commons.io.LineIterator;

/**
 * Translation class
 *
 */
public class TranslationDto extends AbstractDto {

    /**
     * Fill Map with the translation data, make sure the file source is encoded in Shift-JIS.
     * 
     * @param HashMap
     * @param fileName
     * @param columnJP
     * @param columnEN
     * @return Japanese data
     * @return English data
     * @throws IOException
     */
    @CheckForNull
    public static void fillMap(Map<String, String> map, File fileName, int columnJP, int columnEN) throws IOException {
        if (!fileName.canRead()) {
            //TODO Do something if the file is not found.
        }
        try (Reader reader = new BufferedReader(new FileReader(fileName))) {
            LineIterator ite = new LineIterator(reader);
            // Skip the header
            if (ite.hasNext()) {
                ite.next();
            }
            while (ite.hasNext()) {
                String line = ite.next();
                String[] colums = line.split(";");
                map.put(colums[columnJP], colums[columnEN]);
            }
        }
    }
}
