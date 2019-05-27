package schildt_proj.Exception_Handling;

/**
 * Created by RI on 6/1/2017.
 */
public class ExceptionDemo5 {
    public static void main(String args[]){
        int numbers[] = {2,4,22,80,454,56};
        int denom[] = {2,0,0,6};
        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(numbers[i]+"/"+denom[i]+" = "+numbers[i]/denom[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("No matching element found.");
            }catch (Throwable e){
                System.out.println("Some exception occurred");
            }
        }
    }
}
