package task1;

public class Test {

    public static void testing() {

        int a = 1;
        int b = 1;
        int c = 1;

        if (NumberComparison.compareNumbers(a, b, c)) {
            System.out.printf("a=%d , b=%d , c=%d ;" + "\n", a, b, c);
            System.out.printf("Numbers are equal." + "\n");
        } else {
            System.out.printf("a=%d , b=%d , c=%d ;" + "\n", a, b, c);
            System.out.println("Numbers are different.");
        }

    }

}
