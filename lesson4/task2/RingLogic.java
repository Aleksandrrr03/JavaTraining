package task2;

public class RingLogic {
    static final float PI = 3.14f;

    public static float findRingSquare(float r1, float r2) {

        if (r1 > r2) {
            return PI * (r1 * r1 - r2 * r2);
        } else if (r2 < r1) {
            return PI * (r2 * r2 - r1 * r1);
        } else {
            return 0;
        }

    }
}
