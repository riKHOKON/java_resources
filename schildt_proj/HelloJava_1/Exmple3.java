package schildt_proj.HelloJava_1;

/**
 * Created by rashedulislam on 12/21/2016.
 * Demonstrating the difference between int and double
 */
public class Exmple3 {
    public static void main(String args[]){
        int intVar = 10;
        double doubleVar = 10.0;
        System.out.println("Original value of intVar "+intVar);
        System.out.println("Original value of doubleVar "+doubleVar);
        // now divide both of them by 4;
        intVar /= 4;
        doubleVar /= 4;
        System.out.println("After divide value of intVar "+intVar);
        System.out.println("After divide  value of doubleVar "+doubleVar);

    }
}
