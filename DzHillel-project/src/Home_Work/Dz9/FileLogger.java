package Home_Work.Dz9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger {
    private FileLoggerConfiguration configuration;

    public FileLogger(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
    }

    public void info(String massage) throws Exception {
        if (configuration.getLoggingLevel() != LoggingLevel.INFO) {
            throw new Exception("Logging level is not INFO.");
        }
        log(massage, configuration.getLoggingLevel());
    }

    public void debug(String massage) throws Exception {
        if (configuration.getLoggingLevel() != LoggingLevel.DEBUG) {
            throw new Exception("Logging level is not DEBUG.");
        }
        log(massage, configuration.getLoggingLevel());
    }

    private void log(String message, LoggingLevel loggingLevel) throws FileMaxSizeReachedException {
        long totalSize = configuration.getFilePath().length() + message.getBytes().length;

        if (totalSize > configuration.getMaxSize()) {
            throw new FileMaxSizeReachedException("File + message is too big size: " + totalSize + "byte.");
        }

        try {
            String logMessage = String.format("Log_[%s]%s", getTimestamp(loggingLevel), loggingLevel);

            File file;
            if (loggingLevel != LoggingLevel.INFO) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                message = formatter + "\n" + message;
            }
            file = new File(configuration.getFilePath().getName()
                    + File.separator + logMessage + configuration.getFormat());

            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getName());
                FileWriter writer = new FileWriter(file);
                writer.write(message);
                writer.close();
            } else {
                System.out.println("Файл уже существует.");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при создании файла.");
            e.printStackTrace();
        }

    }

    private String getTimestamp(LoggingLevel loggingLevel) {
        DateTimeFormatter formatter;
        if (loggingLevel == LoggingLevel.INFO) {
            formatter = DateTimeFormatter.ofPattern("yyyy");
        } else {
            formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        }
        return LocalDateTime.now().format(formatter);
    }

}
