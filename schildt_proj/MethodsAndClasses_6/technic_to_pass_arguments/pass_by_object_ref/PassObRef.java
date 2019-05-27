package schildt_proj.MethodsAndClasses_6.technic_to_pass_arguments.pass_by_object_ref;

/**
 * Created by ri on 1/25/17.
 */
public class PassObRef {
    public static void main(String args[]){
        Test ob = new Test(15,20);

        System.out.println("ob.a and ob.b before call :"+ob.getA()+"  "+ob.b);
        ob.change(ob);
        System.out.println("ob.a and ob.b after call :"+ob.getA()+"  "+ob.b);

    }
}
