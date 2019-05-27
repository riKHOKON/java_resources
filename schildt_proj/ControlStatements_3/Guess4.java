package schildt_proj.ControlStatements_3;

/**
 * Created by rashedulislam on 23-12-16.
 */
public class Guess4 {
    public static void main(String args[])
        throws java.io.IOException{
        char ch, ignore , answer='K';
        do {
            System.out.println("I'm thinking of a letter" +
                    ". Can you guess it! ");
            // reading a charecter from keyboard
            ch = (char)System.in.read();
            // discard all other input
            do {
                ignore = (char)System.in.read();
            }while (ignore != '\n');
            if (ch == answer) System.out.println("****Right****");
            else {
                System.out.println("Sorry you are ");
                if (ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again.");
            }
        }while (ch != answer);
    }
}
