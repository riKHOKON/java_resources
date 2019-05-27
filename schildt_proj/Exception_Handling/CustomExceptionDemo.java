package schildt_proj.Exception_Handling;

/**
 * Created by RI on 6/2/2017.
 */
public class CustomExceptionDemo {
    public static void main(String args[]){
        int numbers[] = {2,4,22,80,451,56,122,23};
        int denom[] = {2,0,0,6,7};
        for (int i = 0; i < numbers.length; i++) {
            try {
                if (numbers[i] % 2 != 0)
                    throw new NonIntResultException(numbers[i],denom[i]);
                System.out.println(numbers[i]+"/"+denom[i]+" = "+numbers[i]/denom[i]);
            } catch (ArithmeticException e){
                System.out.println("Can't divided by zero.");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("No matching element found.");
            } catch (NonIntResultException e) {
//                e.printStackTrace();
                System.out.println(e);
            }
        }
    }
}
