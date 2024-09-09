// Logger class using the Singleton pattern
class Logger {
    // Private static instance of Logger - the single instance that will be created
    private static Logger instance;
    
    // Private constructor to prevent instantiation from outside the class
    private Logger() {
        // Initialize any resources or logging configurations if needed
    }

    // Public static method to provide access to the single instance of Logger
    public static Logger getInstance() {
        if (instance == null) {
            // Create a new instance if not already created
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages (can be customized as needed)
    public void log(String message) {
        // Simulate writing the log message to a file or console
        System.out.println("[LOG] " + message);
    }
}

// Application class to demonstrate the use of Singleton Logger
public class SingletonLoggerExample {

    public static void main(String[] args) {
        // Get the single instance of Logger
        Logger logger = Logger.getInstance();

        // Log some messages using the single instance
        logger.log("Application started");
        logger.log("Performing some operation...");
        logger.log("An error occurred");

        // Get the same instance again and log another message
        Logger sameLogger = Logger.getInstance();
        sameLogger.log("Application is shutting down");

        // Verify that both logger instances are the same
        System.out.println("Are both logger instances the same? " + (logger == sameLogger));
    }
}
