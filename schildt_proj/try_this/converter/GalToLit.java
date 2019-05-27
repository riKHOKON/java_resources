package schildt_proj.try_this.converter;

/**
 * Created by rashedulislam on 12/21/2016.
 * Gallon to liter converter.
 */
public class GalToLit {
    public static void main(String args[]){
        double drum1Contains = 10; // gallons of oil. convert it into liters
        double liters = galTolit(drum1Contains);
        System.out.println(drum1Contains+" gallons is equal to "+liters+" liters");
    }
    public static double galTolit(double gallon){
        double liters = 0;
        liters = gallon * 3.7854;
        return liters;
    }
}
