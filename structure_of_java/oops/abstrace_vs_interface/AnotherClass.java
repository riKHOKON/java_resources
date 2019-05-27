package structure_of_java.oops.abstrace_vs_interface;
/**
 * Created by ri on 2/16/17.
 */
public class AnotherClass extends MyClass {
    @Override
    public void B() {
        System.out.println("This is B");
    }
    @Override
    public void show() {
        System.out.println("this is showInfo time");
    }
    @Override
    public void toDo() {
        System.out.println("To do a lot of things.");
    }

    // main method
    public static void main(String args[]){
        MyMethods methods=new AnotherClass();
        methods.B();
        methods.print();
        methods.show();
        methods.toDo();
    }
}
