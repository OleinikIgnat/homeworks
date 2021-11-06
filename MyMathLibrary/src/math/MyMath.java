/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author KitUnity
 */
public class MyMath {
    public static double calcGeron(double A, double B, double C)
    {
        double p = (A + B + C) / 2.0;
        double S = Math.sqrt (p * (p - A) * (p - B) * (p - C));
        return S;
    }
    public static double calcPifagor(double A, double B)
    {
        double C = Math.sqrt(A * A + B * B);
        return C;
    }
    public static double calcLengthOfLine(double x1, double x2, double y1, double y2)
    {
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return d;
    }
}
