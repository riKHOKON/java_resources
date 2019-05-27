package schildt_proj.Exception_Handling.mini_projs;

/**
 * Created by RI on 6/2/2017.
 */
public class QueueFullException extends Exception {
    int size;

    public QueueFullException(int size) {
        this.size = size;
    }
    @Override
    public String toString() {
        return "\nQueueFullException{" +
                "Maximum size is = " + size +
                '}';
    }
}
