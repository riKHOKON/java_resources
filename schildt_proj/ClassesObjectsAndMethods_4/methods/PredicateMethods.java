package schildt_proj.ClassesObjectsAndMethods_4.methods;

import java.util.Scanner;
/**
 * Created by ri on 1/25/17.
 * Predicate method is a boolean method returns only true of false
 */
public class PredicateMethods {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        /*
        int myVal;
        System.out.print("Enter a number to check : ");
        myVal = input.nextInt();
        if (isEven(myVal))
            System.out.println("This number is an even number.");
        else System.out.println("This is an odd number.");
        */
        System.out.println("Enter a sentence : ");
        String sentence = input.nextLine();
        for (int pos = 0; pos < sentence.length(); ++pos)
            if (isVowel(sentence.charAt(pos)))
                System.out.print(sentence.charAt(pos) + " ");
    }


    static boolean isEven(int number){
        if (number%2 == 0)
            return true;
        else
            return false;
    }
    static boolean isVowel(char c){
        if (c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c =='u')
            return true;
        else return false;
    }
}
