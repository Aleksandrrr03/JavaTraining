package by.epam.javatraining.kotkovets.lesson06.task04.model.logic;

public class NumberLogic {

    public static boolean isEvenParity(int number) {
        number = number>0?number:-number;
        while (number > 0) {
            if ((number % 10) % 2 != 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    public static boolean isParityOdd(int number) {
        number = number>0?number:-number;
        while (number > 0) {
            if (number % 10 % 2 == 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    public static boolean isSameParity(int number) {
        return isEvenParity(number) || isParityOdd(number);
    }
}
