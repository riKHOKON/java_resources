package schildt_proj.MethodsAndClasses_6.technic_to_pass_arguments;

/**
 * Created by ri on 1/25/17.
 * Primitive types are passed by value.Let's look an example
 */
public class Test {

    /*
    * This method causes no change to the arguments
    * used in the call.
    * */
    void noChange(int i, int j){
        i = i + j;
        j = -j;
    }

}
