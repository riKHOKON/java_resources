package schildt_proj.MethodsAndClasses_6.returning_objects;

/**
 * Created by ri on 1/25/17.
 */
public class ErrMsg {
    public static void main(String args[]){
       ErrorMsg err = new ErrorMsg();
       System.out.println(err.getErrorMsgs(2));
       System.out.println(err.getErrorMsgs(19));
    }
}
