package structure_of_java.oops.static_keyword;

/**
 * Created by ri on 2/8/17.
 */
public class Counter {
    // a instance variable count
    int count=0;
    Counter(){
        ++count;
        System.out.println(count);
    }
    public static void main(String args[]){
        Counter counter1=new Counter();
        Counter counter2=new Counter();
        Counter counter3=new Counter();
    }
}
