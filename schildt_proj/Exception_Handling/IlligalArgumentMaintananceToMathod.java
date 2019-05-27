package schildt_proj.Exception_Handling;
import java.util.Scanner;

/**
 * Created by RI on 6/2/2017.
 */
public class IlligalArgumentMaintananceToMathod {
    public static void showResult(int number) throws
        IllegalArgumentException {
        if (number > 80 & number < 100 )
            System.out.println("It's A+");
        else
            System.out.println("It's B+");
    }
    public static void main(String args[]){
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your number : ");
            String number = input.nextLine();
            showResult(Integer.parseInt(number));
        }catch (IllegalArgumentException e){
            System.out.println("Exception occurred "+e);
        }
    }
}
