package structure_of_java.oops.this_keyword;

public class Student{

    private int rollno;
    private String name;
    private float fee;

    public Student(int rollno,String name,float fee){
        rollno=rollno;
        name=name;
        fee=fee;
    }/*

// If local variables(formal arguments) and
// instance variables are different,
// There is no need to use this keyword like
// in the following program

    public Student(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }*/
    public void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }
} 