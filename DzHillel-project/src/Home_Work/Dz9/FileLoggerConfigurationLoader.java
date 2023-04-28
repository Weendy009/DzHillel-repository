package Home_Work.Dz9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileLoggerConfigurationLoader {
    public FileLoggerConfiguration load(File file) throws Exception {
        String[] config;
        FileLoggerConfiguration fileLogger;
        if (file.length() == 0) {
            throw new Exception("Input file is empty.");
        }
        config = new String[4];

        try (BufferedReader br = new BufferedReader(new FileReader(file.getName()))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    config[i++] = parts[1].trim();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        fileLogger = new FileLoggerConfiguration(new File(config[0]), LoggingLevel.valueOf(config[1]), config[3]);

        return fileLogger;
    }
}
