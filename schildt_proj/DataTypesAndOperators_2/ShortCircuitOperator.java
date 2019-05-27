package schildt_proj.DataTypesAndOperators_2;

/**
 * Created by rashedulislam on 12/21/2016.
 * Demonstrate short circuit operators
 */
public class ShortCircuitOperator {
    public static void main(String args[]){
        int n, d, q;
        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0) System.out.println(d+" is factor of "+n);
        d = 0;
        if (d != 0 && (n % d) == 0) System.out.println(d+" is factor of "+n);

        /* Now try this without short circuit operator
         * this will cause a divide by zero error
         */
        d = 0;
        //if (d != 0 & (n % d) == 0) System.out.println(d+" is factor of "+n);


    }
}
