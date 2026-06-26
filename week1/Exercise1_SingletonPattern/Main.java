public class Main {

    public static void main(String[] args) {

        LoggerManager logger1 = LoggerManager.getInstance();
        LoggerManager logger2 = LoggerManager.getInstance();

        logger1.log("Application Started");
        logger2.log("Application Running");

        if (logger1 == logger2) {
            System.out.println("Only one LoggerManager instance exists.");
        } else {
            System.out.println("Multiple LoggerManager instances created.");
        }
    }
}