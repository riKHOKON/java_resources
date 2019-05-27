package structure_of_java.oops.aggregation_has_a.has_a_relation_of_circle;

/**
 * Created by ri on 2/11/17.
 */
public class Test {
    public static void main(String args[]){
        Circle c = new Circle();
        double result=c.area(5);
        System.out.println("Area is :"+result);
    }
}
