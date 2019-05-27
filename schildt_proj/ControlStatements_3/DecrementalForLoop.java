package schildt_proj.ControlStatements_3;

/**
 * Created by rashedulislam on 22-12-16.
 * we also can decrement a for loop
 */
public class DecrementalForLoop {
    public static void main(String args[]){
     int i = 100;
     for (;i > 1;--i){
         if (i%2 == 0) System.out.println(i+"   in an even number.");
     }
    }
}
