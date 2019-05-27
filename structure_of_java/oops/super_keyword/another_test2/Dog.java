package structure_of_java.oops.super_keyword.another_test2;

/**
 * Created by ri on 2/11/17.
 */
public class Dog extends Animal{
    void eat(){
        System.out.println("eating bread....");
    }
    void bark(){
        System.out.println("barking.");
    }
    void work(){
        super.eat();
        bark();
    }
}
