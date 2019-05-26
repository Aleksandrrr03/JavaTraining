package task44;

public class Logic {

    final static int NUMBER = 123_123;

    public static int findSum() {
        int a, b, c, d, e, f;

        f = NUMBER % 10;
        e = (NUMBER / 10) % 10;
        d = (NUMBER / 100) % 10;
        c = (NUMBER / 1000) % 10;
        b = (NUMBER / 10000) % 10;
        a = (NUMBER / 100000) % 10;

        return a + b + c + d + e + f;
    }
}
