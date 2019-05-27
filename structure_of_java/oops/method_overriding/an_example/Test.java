package structure_of_java.oops.method_overriding.an_example;

/**
 * Created by ri on 1/29/17.
 */
public class Test {
    public static void main(String args[]){
        Employee e1 = new Employee("Rashedul",30000);
        Manager m1 = new Manager("Raj",50000,"sales");
        System.out.println("Details: ");

        System.out.println(e1.getEmpInfo());
        System.out.println();
        System.out.println(m1.getEmpInfo());

    }
}
