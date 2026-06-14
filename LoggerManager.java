class LoggerManager
{
    private static LoggerManager instance;

    private LoggerManager()
    {
        System.out.println("Logger Manager Created");
    }

    public static LoggerManager getInstance()
    {
        if(instance == null)
        {
            instance = new LoggerManager();
        }

        return instance;
    }
}
