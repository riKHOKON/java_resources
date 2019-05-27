package structure_of_java.oops.this_keyword;

/**
 * Created by ri on 2/8/17.
 */
public class Test1 {
    public static void main(String args[]){
        Student student1=new Student(10,"khokon",1200);
        Student student2=new Student(11,"ripon",1200);
        student1.display();
        student2.display();
    }
}
