package schildt_proj.DataTypesAndOperators_2;

/**
 * Created by rashedulislam on 12/21/2016.
 * Compute the number of cubic inches in a cubic mile
 */
public class Inches {
    public static void main(String args[]){
        long ci,im;
        im = 5280 * 12;
        ci = im * im * im;
        System.out.println("There are "+ci+" cubic inches in a cubic mile.");
    }
}
