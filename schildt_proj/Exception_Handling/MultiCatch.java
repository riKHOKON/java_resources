package schildt_proj.Exception_Handling;

/**
 * Created by RI on 6/2/2017.
 * Using multi catch function using multiple input
 */
public class MultiCatch {
    public static void main(String args[]){
        int a = 90, b = 0;
        char ch[] = {'a','b'};
        int result;
        for (int i = 0; i < 2; i++) {
            try {
                if (i == 0)
                    result = a / b; // generates an arithmetic exception
                else
                    ch[3] = 'a'; // array out of bound exception
            }catch (ArithmeticException  | ArrayIndexOutOfBoundsException e){
                System.out.println("Exception caught "+e);
            }
            finally{
                System.out.println("Inside final block.");
            }
            System.out.println("Outside Try catch.");
        }
    }
}
