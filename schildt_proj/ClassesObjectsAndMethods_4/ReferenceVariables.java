package schildt_proj.ClassesObjectsAndMethods_4;

/**
 * Created by ri on 1/20/17.
 * Using the reference variable of objects and let's see how it works
 */
public class ReferenceVariables {
    public static void main(String args[]){
        // Here the car1 and car2 are the reference variables
        Vehicle car1 = new Vehicle();
        car1.setPassengers(7);
        car1.fuelcap = 16;
        car1.mpg = 21;

        Vehicle car2 = car1;
        System.out.println("Let's see the difference using car2 variable");
        System.out.println("car2 capacity of passengers = "+car2.getPassengers());
        System.out.println("car2 capacity of fuelcap is = "+car2.fuelcap);
        System.out.println("car2 mpg is = "+car2.mpg);
        System.out.println("Are they defining the same object ?");
        car2.setPassengers(12);
        System.out.println("car2 capacity of passengers = "+car2.getPassengers());
        System.out.println("car1 capacity of passengers = "+car1.getPassengers());


    }
}
