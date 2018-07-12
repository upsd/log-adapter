public class LogApp {

    public static void main(String[] args) {
        Log4 logAdapter = new LogAdapter(true);
        Log5 log5Live = new Log5Live();

        logAdapter.log("Testing using adapter");
        log5Live.log("Testing using new logger directly", true);
    }
}
