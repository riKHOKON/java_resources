package schildt_proj.DataTypesAndOperators_2;

/**
 * Created by rashedulislam on 12/21/2016.
 * Using the Pythagorean theorem to compute the length of hypotenuse
 */
public class Hypotenuse {
    public static void main(String args[]){
        double base = 3.8;
        double height = 4.7;
        double hypot = Math.hypot(base,height);
        System.out.println("Hypotenuse is "+hypot);
        hypot = Math.sqrt((base*base)+(height*height));
        System.out.println("Hypotenuse is "+hypot);
    }
}
