package structure_of_java.oops.aggregation_has_a.employee_and_his_address_example_where_has_a_relation;

/**
 * Created by ri on 2/11/17.
 */
public class Tester {
    public static void main(String args[]){
        Address address1=new Address("Dhaka","Mohammadpur","Bangladesh");
        Address address2=new Address("Kuril","Rajsthan","India");

        Employee emp1=new Employee(1,"Rashedul Islam",address1);
        Employee emp2=new Employee(2,"Rubel Islam",address2);

        emp1.display();
        emp2.display();
    }
}
