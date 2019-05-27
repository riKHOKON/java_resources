package schildt_proj.Exception_Handling;

/**
 * Created by RI on 6/1/2017.
 */
public class UseThrowableMethods {
    public static void main(String args[]){
        try {
            ExcTest.genException();
        }catch (ArrayIndexOutOfBoundsException exc){
            // now catch the exception
            System.out.println("Standard message is :");
            System.out.println(exc);
            System.out.println("\nStack trace :");
            exc.printStackTrace();
        }
        System.out.println("After catch statement.");
    }
}
