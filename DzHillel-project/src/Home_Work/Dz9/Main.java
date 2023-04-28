package Home_Work.Dz9;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {

        FileLoggerConfigurationLoader fileLoggerConfigLoader = new FileLoggerConfigurationLoader();
        FileLoggerConfiguration fileLoggerConfiguration = fileLoggerConfigLoader.
                load(new File("./settingFileConfig.txt"));
        FileLogger fileLogger = new FileLogger(fileLoggerConfiguration);

        fileLogger.info("I love you!");

    }
}
