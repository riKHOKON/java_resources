package structure_of_java.oops.dynamic_binding;

/**
 * Created by ri on 2/11/17.
 */
public class Dog extends Animal{
    void eat(){
        System.out.println("dog is eating.");
    }

    public static void main(String args[]){
        Animal dog=new Dog();
        dog.eat();
        /*In the above example object type cannot be determined
         by the compiler,
          because the instance of Dog is also an instance of
           Animal.So compiler doesn't know its type,
            only its base type.

    Dog adog=(Dog) new Animal();
    adog.eat();
       */

    }
}
