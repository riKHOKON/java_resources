package schildt_proj.HelloJava_1;

/**
 * Created by rashedulislam on 12/21/2016.
 *  illustrating if statement.....
 */
public class IfDemo {
    public static void main(String args[]){
        int a = 3, b = 4, c = 5;
        // if looks for true condition if gets true then enters into it's scope
        if (a < b) System.out.println("this is true");
        if (b > c) System.out.println("This is not true and won't displayed.");
        c = a + b;
        if (c > a & c > b) System.out.println("Both conditions are true.");
    }
}
