package by.epam.javatraining.kotkovets.lesson06.task01.model.logic;

import java.util.Random;

public class HeadOrTail {
    private static final int SIDES = 2;
    private static final int TAIL = 0;

    public static String cheakHeadsOrTails(int steps) {
        Random random = new Random();
        String result = "Invalid data!";
        if (steps >= 0) {
            int tail = 0;
            for (int i = 0; i < steps; i++) {
                if (random.nextInt(SIDES + 1) == TAIL) {
                    tail++;
                }
            }
            result = "Heads: " + (steps - tail) + " Tails: " + tail;
        }
        return result;
    }
}
