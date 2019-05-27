package structure_of_java.oops.object_vs_class;

/**
 * Created by ri on 2/1/17.
 */
public class Student {

    private int  rollno;
    private String name;

    public Student() {
        this.rollno=0;
        this.name=null;
    }
    public Student(int rollno,String name) {
        this.rollno = rollno;
        this.name = name;
    }
    void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return rollno + "\t" + name;
    }

}