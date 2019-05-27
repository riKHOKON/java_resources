package schildt_proj.try_this.garbase_collection;

/**
 * Created by ri on 1/21/17.
 */
public class FDemo {
    int x;

    FDemo(int i){
        x = i;
    }
    //Call when object is recycled
    protected void finalize(){
        System.out.println("Finilizing "+x);
    }
    // generates an object that is immediately destroyed
    void generator(int i){
        FDemo o = new FDemo(i);
    }

}
