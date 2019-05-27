package schildt_proj.Package_And_Interface_8.implementing_interface;

/**
 * Created by RI on 5/30/2017.
 */
public class ByThrees implements Series {

    int start;
    int val;

    public ByThrees() {
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public void reset() {
        val = start;
    }

    @Override
    public void setStart(int i) {
        start = i;
        val = i;
    }
}
