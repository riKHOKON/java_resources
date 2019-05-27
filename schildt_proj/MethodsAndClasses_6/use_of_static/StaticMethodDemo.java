package schildt_proj.MethodsAndClasses_6.use_of_static;

/**
 * Created by ri on 1/26/17.
 * use a static method
 */
public class StaticMethodDemo {

    static int val = 1024; // static variable

    // a static method
    static int valDiv2(){
        return val/2;
    }
    /*
    //  test in same class.
    public static void main(String args[]){
        System.out.println("Val is :"+StaticMethodDemo.val);
        System.out.println("StaticMethodDemo.valDiv2(): "+StaticMethodDemo.valDiv2());
        StaticMethodDemo.val = 4;
        System.out.println();
        System.out.println("Val is :"+StaticMethodDemo.val);
        System.out.println("StaticMethodDemo.valDiv2(): "+StaticMethodDemo.valDiv2());

    }
    */
}
