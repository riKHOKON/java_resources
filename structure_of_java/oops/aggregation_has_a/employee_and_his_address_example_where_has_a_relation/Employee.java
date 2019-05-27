package structure_of_java.oops.aggregation_has_a.employee_and_his_address_example_where_has_a_relation;

/**
 * Created by ri on 2/11/17.
 */
public class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    public void display(){
        System.out.println(id+" "+name);
        System.out.println(address.getCity()+" "+address.getState()+" "+address.getCountry());
    }
}
