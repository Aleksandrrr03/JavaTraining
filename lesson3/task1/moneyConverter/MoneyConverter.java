package moneyConverter;

public class MoneyConverter {

    static final float USD_INTO_EUR = 0.8942f;
    static final float EUR_INTO_USD = 1.1183f;
    static final float BYN_INTO_USD = 0.481f;
    static final float BYN_INTO_EUR = 0.4301f;


    public static float conversionUSDintoEUR(float usd){

        return usd*USD_INTO_EUR;
    }

    public static float conversionEURintoUSD(float eur){

        return eur*EUR_INTO_USD;
    }

    public static float conversionBYNintoUSD(float byn){

        return byn*BYN_INTO_USD;
    }

    public static float conversionBYNintoEUR(float byn){

        return byn*BYN_INTO_EUR;
    }




}
