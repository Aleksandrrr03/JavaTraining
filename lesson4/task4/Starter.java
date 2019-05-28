package task4;

public class Starter {

    public static void main(String[] args) {

        int number  = 144_235;
        double numberOfDigits = 6.0;

        System.out.printf("\nArithmetic mean of numbers = %f",Logic.findArithmeticMean(number,numberOfDigits));
        System.out.printf("\nGeometric mean of numbers = %f", Logic.findGeometricMean(number,numberOfDigits));
    }
}
