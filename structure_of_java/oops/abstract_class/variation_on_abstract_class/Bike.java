package structure_of_java.oops.abstract_class.variation_on_abstract_class;

/**
 * Created by ri on 2/11/17.
 */
public abstract class Bike {
    Bike(){
        System.out.println("bike is created.");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear is changed.");
    }
}
