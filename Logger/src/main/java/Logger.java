import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance = null;
    protected int num = 1;

    private Logger() {

    }

    public static Logger get() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    public void log(String msg) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println("[" + formatter.format(date) + " " + num++ + "] " + msg);
    }
}