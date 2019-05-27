package schildt_proj.Exception_Handling.mini_projs;


/**
 * Created by RI on 6/2/2017.
 */
public class FixedQueue implements ICharQ {

    private char q[]; // this array holds the queue
    private int putloc,getloc;// the put and get indices

    FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }
    @Override
    public void put(char ch) throws QueueFullException {
        if (putloc == q.length)
            throw new QueueFullException(q.length);
        q[putloc++] = ch;
    }
    @Override
    public char get() throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();
        return q[getloc++];
    }

}