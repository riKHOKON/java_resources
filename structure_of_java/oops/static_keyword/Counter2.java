package structure_of_java.oops.static_keyword;

/**
 * Created by ri on 2/8/17.
 */
public class Counter2 {
    static int count=0;
    Counter2(){
        ++count;
        System.out.println(count);
    }
    public static void main(String args[]){
        Counter2 counter1=new Counter2();
        Counter2 counter2=new Counter2();
        Counter2 counter3=new Counter2();
    }
}
