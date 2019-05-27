package schildt_proj.ControlStatements_3;

/**
 * Created by rashedulislam on 22-12-16.
 * Computing the square root and the round error
 */
public class SquareRootAndRoundError {
    public static void main(String args[]){
        int number,sqRoot,roundError;
        for (number = 1;number < 100;++number){
            sqRoot = (int)Math.sqrt(number);
            roundError = number - (sqRoot * sqRoot);
            System.out.println("square root of "+number+" is" +
                    " "+sqRoot+" and round error is "+roundError);
        }
    }
}
