package schildt_proj.self_test;

/**
 * Created by rashedulislam on 12/21/2016.
 * Calculating effective weight in moon
 */
public class WightInMoon {
    public static void main(String args[]){
        double myWeight = 64.67; // in kilogram
        System.out.println("I will be "+weightInMoon(myWeight)+" kg in Moon.\n" +
                "While my weight in Earth is "+myWeight+" kg."
        );
    }
    public static double weightInMoon(double earthWeight){
        double weightInMoon = 0.0;
        weightInMoon = earthWeight * 0.17;
        return weightInMoon;
    }
}
