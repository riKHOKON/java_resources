package schildt_proj.Exception_Handling;

/**
 * Created by RI on 6/1/2017.
 */
public class Rethrow {
    public static void genException(){
        int numbers[] = {2,4,2,343,23,13,5,2,80,454,56};
        int denom[] = {2,0,33,0,6,43,23,0};
        for (int i = 0; i < numbers.length; i++){
            try {
                System.out.println(numbers[i]+"/"+denom[i]+" is : "+numbers[i]/denom[i]);
            }catch (ArithmeticException exception){
                System.out.println("Divide by zero exception.");
            }catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("ArrayIndexOutOfBound exception occurred.");
                throw exc;
            }
        }
    }

    public static void main(String args[]){
        try{
            Rethrow.genException();
        }catch (ArrayIndexOutOfBoundsException exc){
            //System.out.println(exc.toString());
            //exc.printStackTrace();
            //System.out.println(exc.getLocalizedMessage());
            //System.out.println(exc.fillInStackTrace());
            //System.out.println(exc.getMessage());
            System.out.println("Fetal error! System exiting.");
        }
    }
}
