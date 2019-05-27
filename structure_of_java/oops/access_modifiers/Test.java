package structure_of_java.oops.access_modifiers;

/**
 * Created by ri on 2/16/17.
 */
public class Test {
    public static void main(String args[]){
        /* as the member is private we can't access it direct

        MyClass classType=new MyClass(1);
        System.out.println(classType.number);
        classType.number=190;
        System.out.println(classType.number);

        */

        MyClass classType=new MyClass(1);
        System.out.println(classType.getNumber());
        classType.setNumber(190);
        System.out.println(classType.getNumber());
    }
}
