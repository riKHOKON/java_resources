package schildt_proj.MethodsAndClasses_6.returning_objects;

/**
 * Created by ri on 1/25/17.
 * Returning a String object.
 */
public class ErrorMsg {
    String msgs[]  = {"Output error",
                        "Input error",
                        "Disk full",
                        "Index out of bounds"};

    // RETURN THE ERROR MESSAGE
    String getErrorMsgs(int i){
        if ( i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Invalid error code.";
    }

}
