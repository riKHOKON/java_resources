package structure_of_java.oops.interface_java.nested_interface.interface_in_class_defination;

/**
 * Created by ri on 2/16/17.
 */
public class Test extends Person implements Person.Details {
    @Override
    public void showDetails(String n, String a) {
        System.out.println("Name : "+n);
        System.out.println("Address : "+a);
    }
    public static void main(String args[]){
        Person me=new Person("Rashedul Islam","Mohammadpur");
        Person.Details details=new Test();
        details.showDetails(me.getName(),me.getAddress());
    }
}
