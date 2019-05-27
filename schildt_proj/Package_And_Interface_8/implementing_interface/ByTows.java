package schildt_proj.Package_And_Interface_8.implementing_interface;

/**
 * Created by RI on 5/30/2017.
 */
class ByTows implements Series {

    int start;
    int val;
    int prev;

    public ByTows() {
        start = 0;
        val = 0;
        prev = -2;
    }
    @Override
    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }
    @Override
    public void reset() {
        val = start;
        prev = start - 2;
    }
    @Override
    public void setStart(int i) {
        start = i;
        val = i;
        prev = i - 2;
    }
    int getPrevious(){
        return prev;
    }
}
