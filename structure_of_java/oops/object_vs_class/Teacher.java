package structure_of_java.oops.object_vs_class;

public class Teacher{

    int idNumber;
    String name;
    String department;
    float salary;

    public Teacher(int idNumber, String name, String department, float salary) {
        this.idNumber = idNumber;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String toString() {
            return idNumber + "\t" + name+"\t"+salary;
        }
}