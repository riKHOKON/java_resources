package schildt_proj.DataTypesAndOperators_2;

/**
 * Created by rashedulislam on 22-12-16.
 * A Promotion surprise!
 */
public class PromotionDemo {
    public static void main(String args[]){
        byte b;
        int i;
        b = 10;
        i =  b * b; // ok no cast needed
        b = (byte)(b * b); // cast needed
        System.out.println("i and b : "+i+" "+b);
        char ch1 = 'a', ch2 = 'b';
        System.out.println((int)ch1);
        System.out.println((int)ch2);
        char mychar = (char)(97+98);
        System.out.println("mychar is "+mychar);
        ch1 = (char)(ch1 + ch2);
        System.out.println(ch1);
    }
}
