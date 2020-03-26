package pgk;

import org.tinylog.Logger;

public class Main {

    public static void main(String[] args) {
        Logger.error("This is an Error message");
        Logger.warn("This is a WARN message");
        Logger.info("This is an INFO message");
        Logger.debug("This is a DEBUG message");
        Logger.trace("This is a Trace message");
        Logger.info("User's name is {}", System.getProperty("user.name"));
        Logger.error(new RuntimeException("Oops"),"Something is wrong");

    }
}
