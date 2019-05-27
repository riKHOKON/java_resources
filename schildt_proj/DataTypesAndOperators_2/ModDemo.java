package schildt_proj.DataTypesAndOperators_2;

/**
 * Created by rashedulislam on 12/21/2016.
 * Demonstrate the % operator
 */
public class ModDemo {
    public static void main(String args[]){
        int iresult = 10/3;
        int irem = 10%3;
        double dresult = 10.0/3;
        double drem = 10.0%3;
        System.out.println("Result and Reminder of 10/3 and 10%3 : "+iresult+" "
                +irem);
        System.out.println("Result and Reminder of 10.0/3 and 10.0%3 : "+dresult+" "
                +drem);
    }
}
