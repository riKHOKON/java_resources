package schildt_proj.MethodsAndClasses_6.access_modifiers;

/**
 * Created by ri on 1/25/17.
 * This class implements a 'fail-soft' array which prevents
 * runtime error
 */
class FailSoftArray {

    private int a[]; // reference to array
    private int errval; // value to return if get() fails
    public int length;
    /* Constructing array given its size and value to return if
    *  get() fails
    **/
    public FailSoftArray(int size,int errv){
        a = new int[size];
        errval = errv;
        length = size;
    }
    // return value at given index
    public int get(int index){
        if (indexOK(index))return a[index];
        return errval;
    }
    // put a value at an index. Return false on failure.
    public boolean put(int index, int val){
        if (indexOK(index)){
            a[index] = val;
            return true;
        }
        return false;
    }
    // return true if index within bounds
    private boolean indexOK(int index){
        if (index >= 0 & index < length)return true;
        return false;
    }
}
