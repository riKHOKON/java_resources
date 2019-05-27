package schildt_proj.Exception_Handling;

/**
 * Created by RI on 6/1/2017.
 *
 *
 */
public class ThrowsDemo {

    public static char prompt(String str)
    throws java.io.IOException{
        System.out.println(str+" : ");
        return (char)System.in.read();
    }

    public static void main(String args[]){
        char ch = 0;
        try {
            ch = ThrowsDemo.prompt("Enter a letter");
        }catch (java.io.IOException exc){
            System.out.println("I/O exception occurred.");
            //ch = 'X';
        }
        System.out.println("You pressed : "+ch);
    }
}
