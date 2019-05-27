package schildt_proj.DataTypesAndOperators_2;

/**
 * Created by rashedulislam on 12/21/2016.
 *
 */
public class RelationalLogicalOperator {
    public static void main(String args[]){
        int i , j;
        boolean b1 , b2;

        i = 10; j = 11;
        /*
         *  Let's use relational operators
         **/
        if (i<j) System.out.println("i is less than j");
        if (i<=j) System.out.println("i is less or equal to j");
        if (i>j) System.out.println("i is grater than j");//this won't execute
        if (i>=j) System.out.println("i is grater than or equal j");
        if (i!=j) System.out.println("i is not equal to j");
        if (i==j) System.out.println("i is equal to j");
         /*
         *  Let's use logical operators
         **/
        b1 = true;b2 = false;
        if (b1 & b2) System.out.println("This won't execute.");
        if (!(b1 & b2)) System.out.println("This is true");
        if (b1 | b2) System.out.println("This b1 | b2 is also true");
        if (b1 ^ b2) System.out.println("this is also true");
    }

}
