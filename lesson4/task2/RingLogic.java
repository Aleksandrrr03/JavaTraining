package task2;

import static java.lang.Math.PI;

public class RingLogic {

    public static double findRingSquare(double r1, double r2) {

        if (r1 > r2) {
            return PI * (r1 * r1 - r2 * r2);
        } else if (r2 < r1) {
            return PI * (r2 * r2 - r1 * r1);
        } else {
            return 0;
        }

    }
}
