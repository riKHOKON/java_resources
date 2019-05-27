package schildt_proj.recursion_by_my_own.inheritance;

public class Employee
{
   private String name;
   protected double salary;

   Employee(String n, double s) {
      name = n;
      salary = s;
   }
 
   public String getName() {
      return name;
   }
   public double getSalary() {
      return salary;
   }
   public String displayEmpInfo() {
      return "Person: " + name + "\n" +
             "Salary: " + salary + "\n";
   }
}