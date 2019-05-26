package task13;

public class Logic {

    public static void checkForTriangle() {

        int a, b, c;
        a = 2;
        b = 2;
        c = 2;

        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("The figure is not a triangle.");
        } else if (a == b && b == c) {
            System.out.println("This is an equilateral triangle.");
        } else if (((a == b) && (b != c)) || ((a == c) && (b != c)) || ((b == c) && (a != c))) {
            System.out.println(" This is an isosceles triangle.");
        } else {
            System.out.println(" This is an arbitrary triangle.");
        }

    }
}
