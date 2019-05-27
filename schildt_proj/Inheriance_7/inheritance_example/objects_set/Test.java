package schildt_proj.Inheriance_7.inheritance_example.objects_set;

/**
 * Created by ri on 1/29/17.
 */
public class Test {
    public static void main(String args[]){
        Employee e1 = new Employee("Rashedul",30000);
        Manager m1 = new Manager("Raj",50000,"sales");
        System.out.println("Details: ");
        /*
        System.out.println("Person :"+e1.getName()+"\nSalary:"+e1.getSalary());
        System.out.println();
        System.out.println("Person :"+m1.getName()+"\nSalary :"+m1.getSalary()+"\nDepartment:"+m1.getDepartment());
        */
        System.out.println(e1.getEmpInfo());
        m1.changeSalary(e1,40000);
        System.out.println();
        System.out.println(e1.getEmpInfo());
        System.out.println();
        System.out.println(m1.getEmpInfo());
        m1.changeSalary(m1,60000);
        System.out.println();
        System.out.println(m1.getEmpInfo());
        System.out.println();

        Object anObject = new Employee("Khokon",5555);
        System.out.println("Types of object : "+anObject.getClass().getName());
        Employee ee = (Employee)anObject;
        System.out.println(ee.getEmpInfo());

    }
}
