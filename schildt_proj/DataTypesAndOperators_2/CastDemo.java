package schildt_proj.DataTypesAndOperators_2;

/**
 * Created by rashedulislam on 12/21/2016.
 * Casting example .............
 */
public class CastDemo {
    public static void main(String args[]){
        double x = 10.0, y = 3.0;
        byte b;
        int i;
        char ch;
        i = (int)(x/y); // casting double to int
        System.out.println("Integer outcome of (x/y): "+i);
        i = 100;
        b =(byte)i;
        System.out.println("Value of b is "+b);
        i = 257;
        b =(byte)i;
        System.out.println("Value of b is : "+b);
        b = 88;
        ch = (char)b;
        System.out.println("ch : "+ch);
    }
}
