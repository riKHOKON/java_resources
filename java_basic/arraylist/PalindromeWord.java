package java_basic.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by RI on 4/12/2017.
 */
public class PalindromeWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String palindrome;
        System.out.print("Enter a word to test: ");
        palindrome = input.nextLine();
        ArrayList<String> p = new ArrayList<String>();
        buildAL(p, palindrome);
        if (isPalindrome(p))
            System.out.println(palindrome + " is a palindrome.");
        else
            System.out.println(palindrome + " is not a palindrome.");
    }

    static void buildAL(ArrayList pword, String word) {
        for(int i = 0; i < word.length(); ++i)
            pword.add(word.charAt(i) + "");
    }
    static boolean isPalindrome(ArrayList word) {
        ArrayList<String> rword = new ArrayList<String>();
        rword.addAll(word);
        Collections.reverse(rword);
        for(int i = 0; i < word.size(); ++i)
            if (!(rword.get(i).equals(word.get(i))))
                return false;
        return true;
    }
}
