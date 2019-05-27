package schildt_proj.DataTypesAndOperators_2;

/**
 * Created by rashedulislam on 12/21/2016.
 * Truth table for logical operator
 */
public class LogicalOperatorTable {
    public static void main(String args[]){
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");
        System.out.println( );
        boolean p,q;
        p = false;
        q = false;
        if (p ==false && q == false){
            System.out.print("0\t\t0\t\t");
            System.out.print("0\t\t0\t\t0\t\t1");
            System.out.println();
        }
        p = false;
        q = true;
        if (p ==false && q == true){
            System.out.print("0\t\t1\t\t");
            System.out.print("0\t\t1\t\t1\t\t1");
            System.out.println();
        }
        p = true;
        q = false;
        if (p ==true && q == false){
            System.out.print("1\t\t0\t\t");
            System.out.print("0\t\t1\t\t1\t\t0");
            System.out.println();
        }
        p = true;
        q = true;
        if (p == true && q == true){
            System.out.print("1\t\t1\t\t");
            System.out.print("1\t\t1\t\t0\t\t0");
            System.out.println();
        }
    }
}
