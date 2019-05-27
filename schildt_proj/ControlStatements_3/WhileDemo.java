package schildt_proj.ControlStatements_3;

/**
 * Created by rashedulislam on 23-12-16.
 * Demonstrating while loop
 */
public class WhileDemo {
    public static void main(String args[]){
        int i = 1;
        int sum = 0;
        while (i <=10){
            sum += i;
            ++i;
        }
        System.out.println("Sum is : "+sum);
        char ch = 'a';
        while (ch <='z'){
            System.out.print(ch+" ");
            ++ch;
        }
    }
}
