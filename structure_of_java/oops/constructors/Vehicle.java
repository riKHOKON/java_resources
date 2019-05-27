package structure_of_java.oops.constructors;

/**
 * Created by ri on 2/8/17.
 */
public class Vehicle {
    String name;
    int wheel;

    Vehicle(){
        System.out.println("This is a vehicle.");
    }
    Vehicle(String name,int wheel){
        this.name=name;
        this.wheel=wheel;
    }
}
