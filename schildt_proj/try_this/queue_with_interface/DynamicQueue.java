package schildt_proj.try_this.queue_with_interface;

/**
 * Created by RI on 5/30/2017.
 */
public class DynamicQueue implements ICharQ {

    private char q[]; // this array holds the queue
    private int putloc,getloc;// the put and get indices


    public DynamicQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    @Override
    public void put(char c) {
        if (putloc == q.length) {
            char t[] = new char[q.length * 2];
            // copy the values from q[] to t[]
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }
        q[putloc++] = c;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println("Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }

}
