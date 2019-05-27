package schildt_proj.ClassesObjectsAndMethods_4;

/**
 * Created by ri on 1/20/17.
 */
class Vehicle {

    private int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallon
    int mpg; // fuel consumption in miles per gallon

    // This is Constructor for Vehicle class

    public Vehicle() {
        passengers = 0;
        fuelcap = 0;
        mpg = 0;
    }
    Vehicle(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }


    public void setPassengers(int passengers){
        this.passengers = passengers;
    }
    public int getPassengers(){
        return passengers;
    }



    double fuelneeded(int miles){
        return miles / mpg;
    }
    int thisVehiclesRange(){
        return fuelcap*mpg;
    }

    // first method to display the range
    void range(){
        System.out.println("Range is "+fuelcap*mpg);
    }
    // returning value from void method
    void myMethod(){
        int i;
        for (i=0;i<10;++i){
            if (i==5)return;
            System.out.println("This is for "+i);
        }
    }
    // what if we return value from method??

}
