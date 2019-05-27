package schildt_proj.Exception_Handling;

/**
 * Created by RI on 6/1/2017.
 * Let's handle error gracefully and continue to next.
 */
public class ExceptionDemo3 {
    public static void main(String args[]){
        int numbers[] = {2,4,22,6,454,56};
        int denom[] = {2,0,0,6,4,0};
        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(numbers[i]+"/"+denom[i]+" = "+numbers[i]/denom[i]);
            }catch (ArithmeticException e){
                System.out.println("Can't divide by zero.");
            }
        }
    }
}
