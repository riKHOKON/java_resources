package schildt_proj.self_test;

/**
 * Created by rashedulislam on 12/21/2016.
 */
public class InchToMeterTable {

    public static void main(String args[]){
        int counter = 0;
        double feet= 12.0;
        double inches = feetToInch(feet);
        for (int i = 1;i <= inches;++i){
            System.out.println(i+" inch is equal to "+inchToMeter(i)+" meters.");
            ++counter;
            if (counter == 12){
                System.out.println();
                counter = 0;
            }
        }
    }
    public static double inchToMeter(double inch){
        double meter = 0.0;
        meter = inch / 39.37;
        return meter;
    }
    public static double feetToInch(double feet){
        double inch = 0.0;
        inch = feet * 12;
        return inch;
    }
}
