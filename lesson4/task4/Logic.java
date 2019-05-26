package task4;

public class Logic {

    final static int NUMBER = 143_456;

    public static float findGeometricMean(){
        int a,b,c,d,e,f;

        f = NUMBER % 10;
        e = (NUMBER / 10) % 10;
        d = (NUMBER / 100) % 10;
        c = (NUMBER / 1000) % 10;
        b = (NUMBER / 10000) % 10;
        a = (NUMBER / 100000) % 10;

        return (float) Math.exp(Math.log(a*b*c*d*e*f)/6);
    }

    public static float findArithmeticMean(){
        int a,b,c,d,e,f;

        f = NUMBER % 10;
        e = (NUMBER / 10) % 10;
        d = (NUMBER / 100) % 10;
        c = (NUMBER / 1000) % 10;
        b = (NUMBER / 10000) % 10;
        a = (NUMBER / 100000) % 10;

        return (a+b+c+d+e+f)/6;
    }

}
