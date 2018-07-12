public class Log5Live implements Log5 {

    @Override
    public void log(String message, boolean isDebug) {
        String output = message;

        if (isDebug) {
            output += " - DEBUG";
        }
        System.out.println(output);
    }
}
