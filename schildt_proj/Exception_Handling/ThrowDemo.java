package schildt_proj.Exception_Handling;

/**
 * Created by RI on 6/1/2017.
 * manually throw an exception
 */
public class ThrowDemo {
    public static void main(String args[]){
        try {
            System.out.println("Before throw.");
            throw new ArithmeticException();
        }catch (ArithmeticException e){
            System.out.println("Exception caught.");
        }
        System.out.println("After try/catch block.");
    }
}
