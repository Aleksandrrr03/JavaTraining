package conversionTesting;

import moneyConverter.MoneyConverter;

public class СonversionTesting {

    public static void testConversion() {
        float usd, eur, byn;

        usd = 23.7f;
        eur = 40.3f;
        byn = 102.65f;

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
