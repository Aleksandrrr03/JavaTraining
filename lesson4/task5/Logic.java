package task5;

public class Logic {


    public static int flipTheNumber(int number) {

        int g = number % 10;
        number /= 10;

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


        /* flip the number */
        int flipNumber = g;

        flipNumber *= 10;
        flipNumber += f;

        flipNumber *= 10;
        flipNumber += e;

        flipNumber *= 10;
        flipNumber += d;

        flipNumber *= 10;
        flipNumber += c;

        flipNumber *= 10;
        flipNumber += b;

        flipNumber += a;

        return flipNumber;
    }
}
