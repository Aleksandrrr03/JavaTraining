package task2;

public class Test {
    public static void testing() {
        float r1, r2;

        r1 = 17.3f;
        r2 = 12.3f;

        if (RingLogic.findRingSquare(r1, r2) != 0) {
            System.out.printf("The ring square = %f", RingLogic.findRingSquare(r1, r2));
        } else {
            System.out.println("Enter the correct data.");
        }

    }
}
