package JavaConceptsPrac;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.FileHandler;
import java.io.IOException;

public class LoggerSingleton {
    private static LoggerSingleton instance;
    private Logger logger;
    
    private LoggerSingleton() {
        // Get or create the logger
        logger = Logger.getLogger(LoggerSingleton.class.getName());
    }
    
    public static LoggerSingleton getInstance() {
        if (instance == null) {
            instance = new LoggerSingleton();
        }
        return instance;
    }
    
    public Logger getLogger() {
        return logger;
    }
    
    public void logInfo(String message) {
        logger.log(Level.INFO, message);
    }
    
    public void logWarning(String message) {
        logger.log(Level.WARNING, message);
    }
    
    public void logSevere(String message) {
        logger.log(Level.SEVERE, message);
    }
    
    public static void main(String[] args) {
        LoggerSingleton log1 = LoggerSingleton.getInstance();
        LoggerSingleton log2 = LoggerSingleton.getInstance();
        
        // Log messages with different levels
        log1.logInfo("This is an INFO message");
        log1.logWarning("This is a WARNING message");
        log1.logSevere("This is a SEVERE message");
        
        // Verify both instances are the same
        System.out.println("Are they the same instance? " + (log1 == log2));
        
        // Access the underlying Logger if needed
        Logger javaLogger = log1.getLogger();
        javaLogger.log(Level.INFO, "Direct access to Java Logger");
    }
}
