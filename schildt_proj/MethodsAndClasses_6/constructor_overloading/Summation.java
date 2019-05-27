package schildt_proj.MethodsAndClasses_6.constructor_overloading;

/**
 * Created by ri on 1/25/17.
 * initialize one object to bookpackext
 */
public class Summation {
    int sum;
    // construct from an int
    Summation(int num){
        sum = 0;
        for (int i = 1;i <= num; ++i)
            sum += i;
    }
    //construct from bookpackext object
    Summation(Summation ob){
        sum += ob.sum;
    }
}
