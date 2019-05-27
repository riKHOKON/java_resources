package schildt_proj.Exception_Handling.mini_projs;

/**
 * Created by RI on 6/2/2017.
 */
public class QueueEmptyException extends Exception{
    @Override
    public String toString() {
        return "\nQueue is empty.";
    }
}
