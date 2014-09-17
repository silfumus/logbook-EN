package logbook.internal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;

import javax.annotation.CheckForNull;

import logbook.data.context.GlobalContext;

import org.apache.commons.io.LineIterator;

/**
 * Translation class
 *
 */
public class TranslationDto {
    public static String getVersion(File fileName) throws IOException {
        if (!fileName.canRead()) {
            //TODO Do something if the file is not found.
        }
        Reader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            LineIterator ite = new LineIterator(reader);
            String line = ite.next();
            String[] version = line.split(";");
            return version[0];
        } finally {
            reader.close();
        }
    }

    /**
     * Fill Map with the translation data, make sure the file source is encoded in UTF-8.
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
            GlobalContext.addConsole("Failed to read " + fileName.getCanonicalPath());
        }
        Reader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
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
            if (!fileName.canRead()) {
                map.put("Unknown", "Unknown");
            }
        } finally {
            reader.close();
        }
    }

    public static void fillIntMap(Map<Integer, String> map, File fileName, int columnJP, int columnEN)
            throws IOException {
        if (!fileName.canRead()) {
            GlobalContext.addConsole("Failed to read " + fileName.getCanonicalPath());
        }
        Reader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            LineIterator ite = new LineIterator(reader);
            // Skip the header
            if (ite.hasNext()) {
                ite.next();
            }
            while (ite.hasNext()) {
                String line = ite.next();
                String[] colums = line.split(";");
                map.put(Integer.parseInt(colums[columnJP]), colums[columnEN]);
            }
            if (!fileName.canRead()) {
                map.put(0, "Unknown");
            }
        } finally {
            reader.close();
        }
    }
}
