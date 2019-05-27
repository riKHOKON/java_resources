package schildt_proj.try_this.garbase_collection;

/**
 * Created by ri on 1/21/17.
 */
public class Finalize {
    public static void main(String args[]){
        int count;
        FDemo ob = new FDemo(0);
        /*
        * Now generate a large number of object. At some point,
        * garbage collection will occur.
        * Note: we might increase the number of objects generated
        * in order to garbage collection.
        * */
        for (count = 1;count<1000000;++count)
            ob.generator(count);
    }
}
