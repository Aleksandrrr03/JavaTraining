package task2.valueExchangeTester;

import task2.valueExchange.valueExchange;

public class valueExchangeTesting {
 
    public static void valueExchangeTester() {

        int[] array = {2, 5};

        System.out.println("\n****The first way to exchange values****");
        System.out.printf("Before the exchange of values: a=%d and b=%d " + "\n", array[0], array[1]);
        array = valueExchange.exchangeValuesFirstWay(array);
        System.out.printf("After the exchange of values: a=%d and b=%d" + "\n", array[0], array[1]);

        System.out.println("\n****The second way to exchange values****");
        System.out.printf("Before the exchange of values: a=%d and b=%d " + "\n", array[0], array[1]);
        array = valueExchange.exchangeValuesSecondWay(array);
        System.out.printf("After the exchange of values: a=%d and b=%d" + "\n", array[0], array[1]);

    }
}
