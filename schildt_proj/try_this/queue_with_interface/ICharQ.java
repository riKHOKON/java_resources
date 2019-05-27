package schildt_proj.try_this.queue_with_interface;

import schildt_proj.Exception_Handling.mini_projs.QueueEmptyException;
import schildt_proj.Exception_Handling.mini_projs.QueueFullException;

/**
 * Created by RI on 5/30/2017.
 */


/*
    * a simple character queue interface
    * */
public interface ICharQ {
    void put(char c);
    // get a character from the queue
    char get();
}


