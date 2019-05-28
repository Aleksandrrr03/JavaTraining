package task4;

public class Logic {

    public static double findGeometricMean(int number, double numberOfDigits) {

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

        return Math.exp(Math.log(a * b * c * d * e * f) / numberOfDigits);
    }

    public static double findArithmeticMean(int number, double numberOfDigits) {

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

        return (a + b + c + d + e + f) / numberOfDigits;
    }

}
