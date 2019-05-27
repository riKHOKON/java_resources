package structure_of_java.oops.interface_java.default_method_with_body_in_interface;

/**
 * Created by rashedulislam on 2/15/2017.
 * Since Java 8, we can have method body in interface. But we need to make it default method.
 * Let's see an example
 */
public interface Greetings {
    void print();
    default void show(){
        System.out.println("You are welcome");
    }
}
