package structure_of_java.oops.aggregation_has_a.has_a_relation_of_circle;

/**
 * Created by ri on 2/11/17.
 */
public class Circle {

    Operation op; // aggregation
    double pi=3.14;

    double area(int radious){
        op = new Operation();
        int rsquare = op.square(radious); //code reusability (i.e. delegates the method call).
        return pi*rsquare;
    }
}
