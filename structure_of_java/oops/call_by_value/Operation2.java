package structure_of_java.oops.call_by_value;

/**
 * Created by ri on 2/16/17.
 */
public class Operation2 {
    int data;
    Operation2(){
        data=50;
    }
    void change(Operation2 op){
        op.data = data+100;
    }

    public static void main(String args[]){
        Operation2 oop=new Operation2();
        System.out.println(oop.data);
        oop.change(oop);
        System.out.println(oop.data);
    }
}
