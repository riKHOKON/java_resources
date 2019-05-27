package schildt_proj.DataTypesAndOperators_2;

/**
 * Created by rashedulislam on 12/21/2016.
 * Character can be handled like integers
 */
public class CharArithDemo {
    public static void main(String args[]){
        char myChar = 'a';
        for (int i = 'a';i <= 'z';++i)
            System.out.println((char)i);
        System.out.println((int)myChar);
        myChar++;
        System.out.println(myChar);
    }
}
