package schildt_proj.MethodsAndClasses_6.access_modifiers;

import java.util.Scanner;

/**
 * Created by ri on 1/25/17.
 */
class AccessDemo {
    public static void main(String args[]){
        MyClass ob = new MyClass();
        /*
        * Access to alpha is only allowed through its accessor methods
        * */
        System.out.println("ob.alpha is "+ob.getAlpha());
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new value to set alpha");
        ob.setAlpha(input.nextInt());
        System.out.println("ob.alpha is now : "+ob.getAlpha());
        // we can't access alpha like ob.alpha as it is private
        // These below are ok as it is public member of the class
        ob.beta = 10;
        ob.gamma =15;
    }
}
