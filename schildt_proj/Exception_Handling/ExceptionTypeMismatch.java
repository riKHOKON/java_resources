package schildt_proj.Exception_Handling;

/**
 * Created by RI on 6/1/2017.
 * here we tried to handle exception with another type of exception handler thus it generates error
 * This won't work.
 */
public class ExceptionTypeMismatch {
    public static void main(String args[]){
        int numbers[] = new int[4];
        try{
            System.out.println("Just before the generation of the exception.");
            numbers[7] = 10;
        }catch (ArithmeticException exc) {
            System.out.println("Array index doesn't exist.");
        }
        System.out.println("Now we are out side of the catch block.");
    }
}
