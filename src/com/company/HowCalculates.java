package com.company;

public class HowCalculates<t> {

    static double sin (double x){
        return Math.sin(x);
    }
    public static void main(String[] args) {
        int a = 5 / 3;
        System.out.println(a);
        int b = 5 % 3;
        System.out.println(b);

        double t;
        t = 1 / 3.;
        System.out.println(t);
        System.out.println(String.format( "%5.2f" ,t));

       // int c=2/0;
       // System.out.println(c);

        double d = 2./0;
        System.out.println(d);;

        double e = d * 0;
        System.out.println(e);

        double f = e * 2;
        System.out.println(f);

        System.out.println(Double.isInfinite(d));
        System.out.println(Double.isNaN(e));

        double g = 1./2/sin(Math.PI/6);
        System.out.println(g);
    }

}
