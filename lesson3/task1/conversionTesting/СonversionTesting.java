package conversionTesting;

import moneyConverter.MoneyConverter;

public class СonversionTesting {

    public static void testConversion() {
       
        double usd = 23.7;
        double eur = 40.3;
        double byn = 102.65;

        // USD conversion into EUR
        System.out.printf("USD=%f"+" => "+"EUR=%f"+ "\n", usd,MoneyConverter.conversionUSDintoEUR(usd));

        // EUR conversion into USD
        System.out.printf("EUR=%f"+" => "+"USD=%f"+ "\n", eur,MoneyConverter.conversionEURintoUSD(eur));

        // BYN conversion into USD
        System.out.printf("BYN=%f"+" => "+"USD=%f"+ "\n", byn,MoneyConverter.conversionBYNintoUSD(byn));

        // BYN conversion into EUR
        System.out.printf("BYN=%f"+" => "+"EUR=%f"+ "\n", byn,MoneyConverter.conversionBYNintoEUR(byn));
    }
}
