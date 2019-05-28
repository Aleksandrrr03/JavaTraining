package task44;

public class Logic {

    public static int findSum(int number) {

        int f = number % 10;
        number /= 10;

        int e = number % 10;
        number /= 10;

        int d = number % 10;
        number /= 10;

        int c = number % 10;
        number /= 10;

        int b = number % 10;
        number /= 10;

        int a = number % 10;

        return a + b + c + d + e + f;
    }
}
