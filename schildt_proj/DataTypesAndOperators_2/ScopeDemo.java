package schildt_proj.DataTypesAndOperators_2;

/**
 * Created by rashedulislam on 12/21/2016.
 * Demonstrate block scope and lifetime of a variable
 */
public class ScopeDemo {
    public static void main(String args[]){
        int a = 10;
        // let's start a new block
        if(a == 10){
            int b = 25;
            System.out.println(a+" is the value of first variable a");
            System.out.println("b is "+b);
            a = b * 25;
        }
        // System.out.println("b is "+b); // b is unknown here
        System.out.println("a is now "+a);
        // bookpackext example
        for (int i = 0;i < 4;i++){
            int y = -1;
            System.out.println("y is "+y);
            y = 100;
            System.out.println("y is now "+y);
        }
        /*
         * System.out.println(y); y is unknown here.
         */
        }
}
