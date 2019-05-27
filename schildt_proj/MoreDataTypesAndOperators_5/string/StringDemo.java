package schildt_proj.MoreDataTypesAndOperators_5.string;

/**
 * Created by ri on 1/24/17.
 * Introducing String
 */
public class StringDemo {
    public static void main(String args[]){
        String str1 = new String("Java Strings are objects.");
        String str2 = "They are constructed in various ways.";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
