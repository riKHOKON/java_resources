package schildt_proj.Inheriance_7.try_this;

/**
 * Created by RI on 5/28/2017.
 */
public class TruckDemo {
    public static void main(String args[]){
        /*
        * constructing some trucks
        * */
        Truck semi = new Truck(2,200,7,44000);
        Truck pickup = new Truck(3,28,15,2000);

        int gallons;
        double distance = 252; // miles

        System.out.println("Semi can carry over "+semi.getCargoCap()+" pounds" +
                "\nTo go a distance of "+distance+" miles, Semi needs "+semi.fuelNeeded(distance)+" gallons of fuel.");
        System.out.println("Pickup can carry over "+pickup.getCargoCap()+" pounds" +
                "\nTo go a distance of "+distance+" miles,  Pickup needs "+pickup.fuelNeeded(distance)+" gallons of fuel.");


    }
}
