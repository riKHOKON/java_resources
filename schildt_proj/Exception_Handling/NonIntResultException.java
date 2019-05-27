package schildt_proj.Exception_Handling;

/**
 * Created by RI on 6/2/2017.
 */
public class NonIntResultException extends Exception {
    private int i,j;

    public NonIntResultException(int i, int j) {
        this.i = i;
        this.j = j;
    }
    public String toString(){
        return "result of "+i+" / "+j+" is non inreger.";
    }
}
