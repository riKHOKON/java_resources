package schildt_proj.MethodsAndClasses_6.use_of_static;

/**
 * Created by ri on 1/26/17.
 */
public class StaticMethodDemoTest {
    public static void main(String args[]){
        System.out.println("Val is :"+StaticMethodDemo.val);
        System.out.println("StaticMethodDemo.valDiv2(): "+StaticMethodDemo.valDiv2());
        StaticMethodDemo.val = 4;
        System.out.println();
        System.out.println("Val is :"+StaticMethodDemo.val);
        System.out.println("StaticMethodDemo.valDiv2(): "+StaticMethodDemo.valDiv2());
    }
}
