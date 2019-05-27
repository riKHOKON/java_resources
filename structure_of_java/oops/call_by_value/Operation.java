package structure_of_java.oops.call_by_value;

public class Operation{
    private int data;

    Operation() {
        data = 50;
    }

    void change(int data){
 data=data+100;
 }
   
  
    public static void main(String args[]){
        Operation op=new Operation();
        System.out.println("before change "+op.data);
        op.change(500);
        System.out.println("after change "+op.data);
    }
}