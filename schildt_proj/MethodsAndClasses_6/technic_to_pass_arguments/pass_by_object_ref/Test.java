package schildt_proj.MethodsAndClasses_6.technic_to_pass_arguments.pass_by_object_ref;

/**
 * Created by ri on 1/25/17.
 */
public class Test {

    private int a;
    int b;

    Test(int i, int j){
        a = i;
        b = j;
    }

    public int getA() {
        return a;
    }

    void change(Test ob){
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
