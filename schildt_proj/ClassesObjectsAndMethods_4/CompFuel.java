package schildt_proj.ClassesObjectsAndMethods_4;

/**
 * Created by ri on 1/20/17.
 */
public class CompFuel {
    public static void main(String agrs[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        double gallons;
        int distance = 252;
        // assigning values to fields in minivan
        minivan.setPassengers(7);
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        // assigning values to fields in sportscar
        sportscar.setPassengers(2);
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(distance);
        System.out.println("To go "+distance+" miles Minivan needs " +
                " "+gallons+" of fuel");

        gallons = sportscar.fuelneeded(distance);
        System.out.println("To go "+distance+" miles Sportscar minivan needs " +
                " "+gallons+" of fuel");

    }
}
