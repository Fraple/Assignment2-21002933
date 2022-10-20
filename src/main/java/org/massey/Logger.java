package org.massey;

public class Logger {
    private static Logger logger = null;

    public static synchronized Logger getInstance() {
        if(logger == null) logger = new Logger();
        return logger;
    }
}
