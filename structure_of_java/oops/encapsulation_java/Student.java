package structure_of_java.oops.encapsulation_java;

/**
 * Created by ri on 2/16/17.
 */
public class Student {

    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    // getter setter ensures the encapsulation in java
    public String getName() {

        return name;
    }
    public int getRoll() {
        return roll;
    }
    public void setName(String name) {

        this.name = name;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
}
