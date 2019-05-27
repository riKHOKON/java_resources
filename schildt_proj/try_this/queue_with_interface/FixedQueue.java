package schildt_proj.try_this.queue_with_interface;



/**
 * Created by RI on 5/30/2017.
 *
 *
 * A fixed size Queue for character
 */
public class FixedQueue implements ICharQ {

    private char q[]; // this array holds the queue
    private int putloc,getloc;// the put and get indices

    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }
    @Override
    public void put(char ch) {
        if (putloc == q.length)
            System.out.println("Size overrun.");
        q[putloc++] = ch;
    }
    @Override
    public char get(){
        if (getloc == putloc)
            System.out.println("Queue is empty.");
        return q[getloc++];
    }

}
