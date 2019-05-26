package task5;

public class Logic {
    final static int NUMBER = 1_234_567;

    public static int flipTheNumber(){
        int a,b,c,d,e,f,g;
        int flipNumber;

        g = NUMBER % 10;
        f = (NUMBER / 10) % 10;
        e = (NUMBER / 100) % 10;
        d = (NUMBER / 1000) % 10;
        c = (NUMBER / 10000) % 10;
        b = (NUMBER / 100000) % 10;
        a = (NUMBER / 1000000) % 10;

        flipNumber = a+b*10+c*100+d*1_000+e*10_000+f*100_000+g*1_000_000;
        return  flipNumber;
    }
}
