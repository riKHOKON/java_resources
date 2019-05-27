package structure_of_java.oops.runtime_polymorphism_in_java.example3;

/**
 * Created by ri on 2/11/17.
 */
public class Honda extends Bike {
    int speedLImit=150;
    public static void main(String args[]){
        Bike myBike=new Honda();
        System.out.println(myBike.speedLimit);// Note: data member can't be overloaded.
        // thus the answer is 90.
    }
}
