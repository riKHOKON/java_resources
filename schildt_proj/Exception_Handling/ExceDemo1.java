package schildt_proj.Exception_Handling;

/**
 * Created by RI on 6/1/2017.
 */
public class ExceDemo1 {
    public static void main(String args[]){
        int numbers[] = new int[7];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i * 3;
        try{
            System.out.println("Just before the generation of the exception.");
            System.out.println(numbers[9]);
        }catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Array index doesn't exist.");
        }
        System.out.println("Now we are out side of the catch block.");
    }
}
