package schildt_proj.try_this.converter;

/**
 * Created by rashedulislam on 12/21/2016.
 */
public class GalToLitTable {
    public static void main(String args[]){
        int counter = 0;
        for (int i = 1; i <= 100;++i){
            System.out.println(i+" gallon is equal to "+galTolit(i)+" liters.");
            ++counter;
            if (counter == 10){
                System.out.println();
                counter = 0;
            }
        }
    }
    public static double galTolit(double gallon){
        double liters = 0;
        liters = gallon * 3.7854;
        return liters;
    }
}
