public class Main
{
    public static void main(String args[])
    {
        LoggerManager obj1 = LoggerManager.getInstance();
        LoggerManager obj2 = LoggerManager.getInstance();
        System.out.println(obj1 == obj2);
    }
}