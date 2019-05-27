package schildt_proj.Inheriance_7.final_prevents_overriding.final_to_data_member;

/**
 * Created by RI on 5/29/2017.
 */
public class ErrorMsg {

    final int  OUTERR = 0;
    final int INEER = 1;
    final int  DISKERR = 2;
    final int  INDEXERR = 3;



    String msgs[] = {
            "Output error",
            "Input error",
            "Disk full",
            "Index out of bound error"
    };

    // returning the error message
    String getErrorMsg(int i){
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Invalid error code.";
    }

    public static void main(String args[]){
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMsg(err.DISKERR));
        System.out.println(err.getErrorMsg(err.INDEXERR));

    }
}
