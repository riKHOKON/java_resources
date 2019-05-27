package schildt_proj.MethodsAndClasses_6.returning_objects.another_example;

/**
 * Created by ri on 1/25/17.
 */
public class Err {

    String msg; // error message
    int severity; // code indecates severity of error

    Err(String m , int s){
        msg = m;
        severity = s;
    }
}
