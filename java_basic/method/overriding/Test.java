package java_basic.method.overriding;

import java.util.ArrayList;

/**
 * Created by ri on 1/29/17.
 */
public class Test {
    public static void main(String args[]){
        Employee e1 = new Employee("Rashedul",30000);
        Manager m1 = new Manager("Raj",50000,"sales");
        Employee e2 = new Employee("Arif",80000);
        Manager m2 = new Manager("Rubel",40000,"EE");
//        System.out.println("Details: ");
//        System.out.println();
//
//        System.out.println(e1.getEmpInfo());
//        System.out.println();
//        System.out.println(m1.getEmpInfo());
        
        ArrayList<Employee> users = new ArrayList();
        users.add(e1);
        users.add(m1);
        users.add(e2);
        users.add(m2);
        for(Employee e : users){
        	System.out.println(e.getEmpInfo());
        	System.out.println();
        }

    }
}
