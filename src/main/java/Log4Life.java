public class Log4Life implements Log4 {

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
