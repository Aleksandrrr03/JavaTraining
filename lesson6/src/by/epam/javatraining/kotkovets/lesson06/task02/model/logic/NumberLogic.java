package by.epam.javatraining.kotkovets.lesson06.task02.model.logic;

public class NumberLogic {

    public static boolean isDecreasingSequence(int number) {
        boolean isDecreasing = false;
        if(number!=0) {
            number = number > 0 ? number : -number;
            while (number / 10 > 0) {
                int n = number % 10;
                number /= 10;
                if (n >= number % 10) {
                    isDecreasing = false;
                    break;
                }
            }
            isDecreasing=true;
        }
        return isDecreasing;
    }

    public static boolean isIncreasingSequence(int number) {
        boolean isDecreasing = false;
        if(number!=0) {
            number = number > 0 ? number : -number;
            while (number / 10 > 0) {
                int n = number % 10;
                number /= 10;
                if (n <= number % 10) {
                    isDecreasing = false;
                    break;
                }
            }
            isDecreasing=true;
        }
        return isDecreasing;
    }
}
