package schildt_proj.Inheriance_7.inheritance_example.objects_set;

/**
 * Created by ri on 1/29/17.
 */
public class Manager extends Employee {
    private String department;

    public Manager(String n,int s,String dept){
        super(n,s);
        department = dept;
    }
    public String getDepartment(){
        return department;
    }
    public String getEmpInfo(){
        String info = super.getEmpInfo();
        return info+"\nDepartment : "+department;
    }
    public void changeSalary(Employee e,int amount){
        e.salary = amount;
    }
}
