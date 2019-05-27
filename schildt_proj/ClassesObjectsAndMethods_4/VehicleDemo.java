package schildt_proj.ClassesObjectsAndMethods_4;

/**
 * Created by ri on 1/20/17.
 * A class uses Vehicle class to instantiate an object of Vehicle type
 */
class VehicleDemo {
    public static void main(String args[]){
        Vehicle minivan = new Vehicle();
        int range;
        // assigning values to fields in minivan
        minivan.setPassengers(7);
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // computing the range of the minivan
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry "+minivan.getPassengers()+"" +
                "\nwith a range of "+range+" miles.");



        // Testing myMethod for the first time
        minivan.myMethod();


    }
}
