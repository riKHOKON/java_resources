package schildt_proj.ClassesObjectsAndMethods_4;

/**
 * Created by ri on 1/20/17.
 */
public class IsFactor {
    public static void main(String args[]){
        Factor f = new Factor();
        if (f.isFactor(2,20)) System.out.println("2 is factor of 20");
        if (f.isFactor(3,20)) System.out.println("3 is factor of 20");
    }
}
