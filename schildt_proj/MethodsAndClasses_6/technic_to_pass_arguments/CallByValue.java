package schildt_proj.MethodsAndClasses_6.technic_to_pass_arguments;

/**
 * Created by ri on 1/25/17.
 */
public class CallByValue {
    public static void main(String args[]){

        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println("a and b before call :"+a+"\t"+b);
        ob.noChange(a,b);
        System.out.println("a and b after call :"+a+"\t"+b);

    }
}
