package moneyConverter;

public class MoneyConverter {

    static final double USD_INTO_EUR = 0.8942;
    static final double EUR_INTO_USD = 1.1183;
    static final double BYN_INTO_USD = 0.481;
    static final double BYN_INTO_EUR = 0.4301;


    public static float conversionUSDintoEUR(double usd){

        return usd*USD_INTO_EUR;
    }

    public static float conversionEURintoUSD(double eur){

        return eur*EUR_INTO_USD;
    }

    public static float conversionBYNintoUSD(double byn){

        return byn*BYN_INTO_USD;
    }

    public static float conversionBYNintoEUR(double byn){

        return byn*BYN_INTO_EUR;
    }

}
