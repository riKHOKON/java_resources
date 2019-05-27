package structure_of_java.oops.wrapper_class;

/**
 * Created by ri on 2/16/17.
 */
public class WarpperClassExample2 {
    public static void main(String args[]){
        Integer i = new Integer(4);
        int a = i.intValue(); // this is called unboxing
        // java compiler can convert it automatically. like this bellow
        Integer k = new Integer(4);
        int d=k;
        System.out.println(i+" "+a+" "+d);
    }
}
