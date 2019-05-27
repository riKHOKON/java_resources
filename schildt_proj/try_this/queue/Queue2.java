package schildt_proj.try_this.queue;

/**
 * Created by ri on 1/22/17.
 */
public class Queue2 {
    int q[];
    int putloc, getloc; // the put and get indices

    Queue2(int size){
        q = new int[size];
        putloc = getloc = 0;
    }
    // put characters in the queue
    void put(int i){
        if (putloc == q.length){
            System.out.println("- Queue is full.");
            return;
        }
        q[putloc++]= i;
    }
    int get(){
        if (getloc == putloc){
            System.out.println("-Queue is empty.");
            return 0;
        }
        return q[getloc++];
    }
}
