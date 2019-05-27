package schildt_proj.ClassesObjectsAndMethods_4;

/**
 * Created by ri on 1/20/17.
 */
public class TwoVehicle {
    public static void main(String args[]){
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1,range2;

        // assigning values to fields in minivan
        minivan.setPassengers(7);
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assigning values to fields in sportscar
        sportscar.setPassengers(2);
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;
        // computing the range of the minivan and the sportscar
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Minivan can carry "+minivan.getPassengers()+"" +
                " with a range of "+range1+" miles.");
        System.out.println("Sportscar can carry "+sportscar.getPassengers()+"" +
                " with a range of "+range2+" miles.");
    }
}
