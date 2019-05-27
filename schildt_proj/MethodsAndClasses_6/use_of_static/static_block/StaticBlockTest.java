package schildt_proj.MethodsAndClasses_6.use_of_static.static_block;

/**
 * Created by ri on 1/26/17.
 * Wherever we do while we use a class contains static block
 * that static block always executes first.
 * the example describes a static block
 */
public class StaticBlockTest {
    public static void main(String args[]){
        //StaticBlock ob = new StaticBlock("Inside the constructor.");
        System.out.println("Square root of 2 is :"+StaticBlock.rootOf2);
        System.out.println("Square root of 2 is :"+StaticBlock.rootOf2);
    }
}
