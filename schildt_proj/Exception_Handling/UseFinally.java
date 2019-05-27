package schildt_proj.Exception_Handling;

/**
 * Created by RI on 6/1/2017.
 */
public class UseFinally {

    public static void genException(int what){
        int t;
        int nums[] = new int[2];
        System.out.println("Receiving "+what);
        try{
            switch (what){
                case 0:
                    t = 10/what; // divided by zero error
                    break;
                case 1:
                    nums[4] = what; // array out of bound exception
                    break;
                case 2:
                    return;
            }
        }catch(ArithmeticException exc){
            System.out.println("Can't divide by zero.");
            return;
        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("ArrayIndexOutOfBound exception occurred.");
        }finally {
            System.out.println("Leaving try.");
        }

    }


    public static void main(String args[]){
        for (int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }


}
