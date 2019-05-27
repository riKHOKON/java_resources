package schildt_proj.MethodsAndClasses_6.method_overloading;

/**
 * Created by ri on 1/25/17.
 */
public class Overload {
    /*  Basically overload methods are same name methods
    *   they can have different parameters and return types
    *   also
    **/

    void ovlDemo(){
        System.out.println("No parameters.");
    }
    // overload method for one integer parameter
    void ovlDemo(int a){
        System.out.println("One parameter."+a);
    }
    /*
    int ovlDemo(int a){
        return a;   this is invalid because there is bookpackext same parameter overload
                    method with different return type.
    }*/
    // overload method for two integer parameter with return type
    int ovlDemo(int a,int b){
        System.out.println("Two parameters "+a+"\t"+b);
        return a + b;
    }
    // overload method for two double parameters with return type
    double ovlDemo(double a,double b){
        System.out.println("Parameters are "+a+"\t"+b);
        return a + b;
    }
}
