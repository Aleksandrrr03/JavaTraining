package task2;

public class Test {
    public static void testing() {


        double r1 = 17.3;
        double r2 = 12.3;

        if (RingLogic.findRingSquare(r1, r2) != 0) {
            System.out.printf("The ring square = %f", RingLogic.findRingSquare(r1, r2));
        } else {
            System.out.println("Enter the correct data.");
        }

    }
}
