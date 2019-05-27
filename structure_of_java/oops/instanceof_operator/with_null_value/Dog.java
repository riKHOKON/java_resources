package structure_of_java.oops.instanceof_operator.with_null_value;

/**
 * Created by ri on 2/11/17.
 * If we apply instanceof operator with a variable that have null value,
 * it returns false.
 * Let's see the example given below where we apply instanceof operator
 * with the variable that have null value.
 */
public class Dog {
    public static void main(String args[]){
        Dog dog=null;
        System.out.println(dog instanceof Dog);
    }
}
