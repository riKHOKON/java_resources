package structure_of_java.oops.interface_java.nested_interface.interface_in_class_defination;

/**
 * Created by ri on 2/16/17.
 */
public class Person {
    private String name,address;

    public Person() {
        name = "";
        address="";
    }
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
// this is an inner interface
    interface Details{
        void showDetails(String n, String a);
    }
}
