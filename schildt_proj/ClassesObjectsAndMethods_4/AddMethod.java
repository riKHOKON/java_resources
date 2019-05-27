package schildt_proj.ClassesObjectsAndMethods_4;

/**
 * Created by ri on 1/20/17.
 * Adding the first method of vehicle class
 */
public class AddMethod {
    public static void main(String args[]){
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle(2,14,12);

        // int range1,range2; there is no need of these variable

        // assigning values to fields in minivan
        minivan.setPassengers(7);
        minivan.fuelcap = 16;
        minivan.mpg = 21;


        System.out.println("Minivan can carry "+minivan.getPassengers());
        // Declaration of the range method for minivan
        minivan.range();
        System.out.println("Sportscar can carry "+sportscar.getPassengers());
        // Declaration of the range method for sportscar once again
        sportscar.range();
        /*
         * for the first time we are using this return type method
         * So we should use it to somewhere or to keep it in variable!!
         * In this case we would use it in println statement
         */
        System.out.println(sportscar.thisVehiclesRange());
    }
}
