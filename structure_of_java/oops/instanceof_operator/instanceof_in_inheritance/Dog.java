package structure_of_java.oops.instanceof_operator.instanceof_in_inheritance;

/**
 * Created by ri on 2/11/17.
 * An object of subclass type is also a type of parent class.
 * For example, if Dog extends Animal then object of
 * Dog can be referred by either Dog or Animal class.
 */
public class Dog extends Animal {
    public static void main(String args[]){
        Animal dog=new Dog();
        System.out.println(dog instanceof Animal);
        System.out.println(dog instanceof Dog);
    }
}
