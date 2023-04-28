package Home_Work.Dz9;

import java.io.File;

public class FileLoggerConfiguration {
    private File filePath;
    private LoggingLevel loggingLevel;
    private final long MAXSIZE = 100_000;
    private String format;

    public FileLoggerConfiguration(File filePath, LoggingLevel loggingLevel) {
        this.filePath = filePath;
        this.loggingLevel = loggingLevel;
        this.format = ".txt";
    }

    public FileLoggerConfiguration(File filePath, LoggingLevel loggingLevel, String format) {
        this.filePath = filePath;
        this.loggingLevel = loggingLevel;
        this.format = format;
    }

    public File getFilePath() {
        return filePath;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public long getMAXSIZE() {
        return MAXSIZE;
    }

    public String getFormat() {
        return format;
    }

}