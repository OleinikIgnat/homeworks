package mymathlibrarytester;

import math.MyMath;

public class MyMathLibraryTester {

    public static void main(String[] args) {
        double a = 5;
        double b = 3;
        double c = 4;
        double S = MyMath.calcGeron(a, b, c);
        System.out.println(S);
        a = MyMath.calcPifagor(c, b);
        System.out.println(a);
        double x1 = 1;
        double x2 = 3;
        double y1 = 1;
        double y2 = 1;
        double d = MyMath.calcLengthOfLine(x1, x2, y1, y2);
        System.out.println(d);
    }
    
}
