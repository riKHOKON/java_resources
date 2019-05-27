package schildt_proj.Exception_Handling;

/**
 * Created by RI on 6/1/2017.
 * this is a nested try block.
 *
 */
public class NestedTrys {
    public static void main(String args[]){
        int numbers[] = {2,4,2,343,23,13,5,2,80,454,56};
        int denom[] = {2,0,33,0,6,43,23,0};
        try {
            for (int i = 0; i < numbers.length ; i++) {
                try {
                    System.out.println(numbers[i]+"/"+denom[i]+" is : "+numbers[i]/denom[i]);
                }catch (ArithmeticException e){
                    System.out.println("Divide by zero exception occurred.");
                }
            }
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound exception.");
            System.out.println("Fatal error system terminating.");
        }
    }
}
