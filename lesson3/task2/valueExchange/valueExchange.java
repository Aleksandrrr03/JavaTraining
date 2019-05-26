package task2.valueExchange;

public class valueExchange {

    public static int[] exchangeValuesFirstWay(int[] array) {

        array[0] = array[0] + array[1];
        array[1] = array[0] - array[1];
        array[0] = array[0] - array[1];

        return array;
    }

    public static int[] exchangeValuesSecondWay(int[] array) {

        array[0] = array[0] ^ array[1];
        array[1] = array[0] ^ array[1];
        array[0] = array[0] ^ array[1];

        return array;
    }
}
