public class LogAdapter implements Log4 {

    private final boolean isDebug;

    public LogAdapter(boolean debug) {
        this.isDebug = debug;
    }

    @Override
    public void log(String message) {
        new Log5Live().log(message, isDebug);
    }
}
