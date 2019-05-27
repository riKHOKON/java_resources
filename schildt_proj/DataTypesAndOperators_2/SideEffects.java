package schildt_proj.DataTypesAndOperators_2;

/**
 * Created by rashedulislam on 12/21/2016.
 * Side effects are also important.Let's see in example.
 */
public class SideEffects {
    public static void main(String args[]){
        int i = 0;
        if (false & (++i < 100))
            System.out.println("This won't execute.");
        System.out.println("But i is incremented and it is "+i);
        /*
        * In this time i will not incremented because of short circuit operator
        * */
        if (false && (++i < 100))
            System.out.println("This also will not displayed.");
        System.out.println("i contains previous value that is "+i);
    }
}
