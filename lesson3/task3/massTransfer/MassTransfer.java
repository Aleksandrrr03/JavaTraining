package task3.massTransfer;

public class MassTransfer {

    public static double conversionKgToTon(int weight_kg) {

        return  ((double)weight_kg / 1000);
    }

    public static long conversionKgToGram(int weight_kg) {

        return (weight_kg * 1000);
    }

    public static long conversionKgToMGram(int weight_kg) {

        return (weight_kg * 1_000_000);
    }
}
