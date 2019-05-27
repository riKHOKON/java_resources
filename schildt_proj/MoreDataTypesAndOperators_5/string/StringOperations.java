package schildt_proj.MoreDataTypesAndOperators_5.string;

/**
 * Created by ri on 1/24/17.
 * String supports various operations.
 * in this section we will use some of them
 */
public class StringOperations {
    public static void main(String args[]){
        String str1 = "Rashedul";
        String str2 = "Islalm";
        System.out.println("Full name : "+str1.concat(" "+str2));
        for (int i = 0; i < str1.length(); ++i)
            System.out.print(str1.charAt(i)+" ");
    }
}
