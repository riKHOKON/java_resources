package schildt_proj.MethodsAndClasses_6.recursion;

/**
 * Created by ri on 1/25/17.
 * Demonstrates an good example on recursion
 */
public class Factorial {
    // This is a recursive function
    int factR(int n){
        int result;
        if (n == 1)return 1;
        result = factR(n-1) * n; // recursive call to factR().
        return result;
    }
    // This is an iterative function
    int factI(int n){
        int t, result;
        result = 1;
        for (t = 1;t <= n;++t) result *= t;
        return result;
    }
}
