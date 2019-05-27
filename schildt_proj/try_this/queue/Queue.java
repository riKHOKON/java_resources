package schildt_proj.try_this.queue;

/**
 * Created by ri on 1/22/17.
 * A queue class for characters
 */
public class Queue {

    private char q[];// this array holds the queue
    private int putloc, getloc; // the put and get indices
    // constructing an empty Queue given its size
    Queue(int size){
        q = new char[size];
        putloc = getloc = 0;
    }
    // constructing a Queue from existing queue object
    Queue(Queue ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        // copy elements
        for (int i = getloc; i < putloc; ++i)
            q[i] = ob.q[i];
    }
    // construct queue with initial value
    Queue(char[] a){
        putloc = 0;
        getloc = 0;
        q = new char[a.length];
        // copy elements
        for (int i = 0; i < a.length; ++i)
            put(a[i]);
    }
    // put characters in the queue
    void put(char ch){
        if (putloc == q.length){
            System.out.println("- Queue is full.");
            return;
        }
        q[putloc++]= ch;
    }
    // get a character from the queue
    char get(){
        if (getloc == putloc){
            System.out.println("-Queue is empty.");
            return (char)0;
        }
        return q[getloc++];
    }
}
