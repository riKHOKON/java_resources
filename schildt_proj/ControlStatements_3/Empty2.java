package schildt_proj.ControlStatements_3;

/**
 * Created by rashedulislam on 23-12-16.
 * Move more out of the for loop
 */
public class Empty2 {
    public static void main(String args[]){
        int i;
        i = 0; // move initialization out of the loop
        for (;i < 10;){
            System.out.println("Pass # : "+i);
            i++;
        }

    }
}
