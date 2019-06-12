package by.epam.javatraining.kotkovets.lesson5.task03.model.logic;

public class Random {

    private static final int MAX_VALUE = 5;
    private static final java.util.Random RND = new java.util.Random();

    public static int makeRandomNumber() {
        return RND.nextInt(MAX_VALUE);
    }
}
