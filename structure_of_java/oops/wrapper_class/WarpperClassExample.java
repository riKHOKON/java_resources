package structure_of_java.oops.wrapper_class;

/**
 * Created by ri on 2/16/17.
 */
public class WarpperClassExample {
    public static void main(String args[]){
        int a=10;
        Integer i;
        i=Integer.valueOf(a);// converting into integer
        Integer j=a;// this is also allowed as the compiler is smart enough to convert automatic
        // and this is called autoboxing
        System.out.println(a+" "+i+" "+j);
    }
}
