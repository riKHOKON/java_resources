package schildt_proj.Inheriance_7.try_this;

/**
 * Created by RI on 5/28/2017.
 */
public class Vehicle {

    private int passengers;
    private int fuelcap;
    private int mpg;

    public Vehicle(int p, int f, int m) {
        this.passengers = p;
        this.fuelcap = f;
        this.mpg = m;
    }

    int range(){
        return mpg * fuelcap;
    }

    double fuelNeeded(double distance){
        return distance / mpg;
    }


    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

}
