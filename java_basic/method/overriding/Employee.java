package java_basic.method.overriding;

/**
 * Created by ri on 1/29/17.
 */
public class Employee {

    private String name;
    protected int salary;

    public Employee(String n,int s){
        name = n;
        salary = s;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public String getEmpInfo(){
        return "Person : "+name+"\nSalary : "+salary;
    }
}
