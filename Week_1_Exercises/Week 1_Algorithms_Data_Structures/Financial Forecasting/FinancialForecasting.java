public class FinancialForecasting {
    public double calculateFutureValue(double presentValue, double growthRate, int years) {

        return recursiveFutureValue(presentValue, growthRate, years);
    }

    private double recursiveFutureValue(double presentValue, double growthRate, int years) {
     
        if (years == 0) {
            return presentValue;
        } else {

            double nextYearValue = presentValue * (1 + growthRate);
            return recursiveFutureValue(nextYearValue, growthRate, years - 1);
        }
    }
}