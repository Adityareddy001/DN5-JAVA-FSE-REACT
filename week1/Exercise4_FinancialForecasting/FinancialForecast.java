class FinancialForecast {

    public static double forecast(double amount, double rate, int years) {

        if (years == 0)
            return amount;

        return forecast(amount * (1 + rate), rate, years - 1);
    }
}