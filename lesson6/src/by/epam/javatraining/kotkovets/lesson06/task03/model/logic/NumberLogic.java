package by.epam.javatraining.kotkovets.lesson06.task03.model.logic;

public class NumberLogic {

    public static int findFactorial(int number) {
        int factorial = 1;
        if (number >= 0) {
            for (int i = 2; i <= number; ++i) {
                factorial *= i;
            }
        } else {
            factorial = -1;
        }
        return factorial;
    }
}
