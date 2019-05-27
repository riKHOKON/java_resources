package schildt_proj.Exception_Handling;

/**
 * Created by RI on 6/1/2017.
 */
public class NotHandled {
    public static void main(String args[]){
        int numbers[] = new int[7];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i * 3;
        System.out.println("Just before the generation of the exception.");
        System.out.println(numbers[9]);
        /*
        these  won't execute
         */
        System.out.println("Array index doesn't exist.");
        System.out.println("Now we are out side of the catch block.");
    }
}
