package schildt_proj.MethodsAndClasses_6.pass_objects_to_methods;

/**
 * Created by ri on 1/25/17.
 * Objects can be passed to methods
 */
public class Block {
    int a, b, c;
    int volume;
    Block(int i,int j,int k){
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }
    //return true if object defines same block
    boolean sameBlock(Block ob){
        if ((ob.a == a) & (ob.b == b) & (ob.c == c))return true;
        else return false;
    }
    boolean sameVolume(Block ob){
        if (ob.volume == volume)return true;
        else return false;
    }
}
