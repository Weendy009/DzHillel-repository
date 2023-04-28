package Home_Work.Dz9;

public class FileMaxSizeReachedException extends Exception {

    public FileMaxSizeReachedException() {
        super();
    }

    public FileMaxSizeReachedException(String message) {
        super(message);
    }

    public FileMaxSizeReachedException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileMaxSizeReachedException(Throwable cause) {
        super(cause);
    }

    protected FileMaxSizeReachedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}