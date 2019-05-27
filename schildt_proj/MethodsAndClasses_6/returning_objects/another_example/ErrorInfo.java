package schildt_proj.MethodsAndClasses_6.returning_objects.another_example;

/**
 * Created by ri on 1/25/17.
 */
public class ErrorInfo {
    String msgs[]  = {"Output error",
            "Input error",
            "Disk full",
            "Index out of bounds"};
    int howbad[] = {3,3,2,4};
    // this method returns an object of Err type
    Err getErrorInfo(int i){
        if (i >= 0 & i < msgs.length)
            return new Err(msgs[i],howbad[i]);
        else return new Err("Invalid Error code",0);
    }
}
