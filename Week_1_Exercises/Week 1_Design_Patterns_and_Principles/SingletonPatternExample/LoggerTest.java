public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Application started.");
        logger.log("Processing data...");
        logger.log("Operation completed.");

        Logger anotherLogger = Logger.getInstance();
        System.out.println("Is the same instance? " + (logger == anotherLogger));
    }
}
