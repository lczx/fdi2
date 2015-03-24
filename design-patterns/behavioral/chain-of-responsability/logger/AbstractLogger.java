package logger;

public abstract class AbstractLogger {

    public static int INFO = 1, DEBUG = 2, ERROR = 3;

    protected int level;

    // Next element in chain of responsability
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level)
            write(message);

        if (nextLogger != null)
            nextLogger.logMessage(level, message);
    }

    protected abstract void write(String message);

}
