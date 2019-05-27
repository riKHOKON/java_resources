package schildt_proj.try_this.queue_with_interface;

/**
 * Created by RI on 5/30/2017.
 */
public class CircularQueue implements ICharQ {

    private char q[]; // this array holds the queue
    private int putloc,getloc;// the put and get indices

    public CircularQueue(int size) {
        q = new char[size + 1]; // allocate memory for queue
        putloc = getloc = 0;
    }
    @Override
    public void put(char c) {
        if (putloc+1==getloc | (putloc==q.length-1) & (getloc==0)){
            System.out.println("Queue is full.");
            return;
        }
        q[putloc++] = c;
        if (putloc==q.length)putloc = 0;
    }
    @Override
    public char get() {
        if (getloc == putloc){
            System.out.println("Queue is empty.");
            return (char)0;
        }
        char ch = q[getloc++];
        if (getloc == q.length)getloc = 0;
        return ch;
    }

}
