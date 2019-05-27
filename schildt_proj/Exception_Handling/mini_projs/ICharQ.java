package schildt_proj.Exception_Handling.mini_projs;

/**
 * Created by RI on 6/2/2017.
 */

public interface ICharQ {
    void put(char c)throws QueueFullException;
    // get a character from the queue
    char get()throws QueueEmptyException;
}