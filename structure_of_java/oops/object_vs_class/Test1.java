package structure_of_java.oops.object_vs_class;

import java.util.ArrayList;

/**
 * Created by ri on 2/1/17.
 */
public class Test1 {

    public static void main(String args[]){
        Student me = new Student();
        //cloning me to myself
        Student student1=new Student(1,"khokon");
        me.setRollno(student1.getRollno());
        me.setName(student1.getName());
        System.out.println("\n"+me.toString());

        Student student2=new Student(2,"arif");
        Student student3=new Student(3,"rubel");
        Student student4=new Student(4,"naim");
        Student student5=new Student(5,"lalon");
        Student student6=new Student(6,"akash");
        Student student7=new Student(7,"sakil");
        Student student8=new Student(8,"bipul");
        Student student9=new Student(9,"jibon");
        Student student10=new Student(10,"ksathi");
        ArrayList<Student>students=new ArrayList<Student>();
        for (int i=0;i<10;++i){
            switch (i){
                case 0:
                    students.add(i,student1);
                    break;
                case 1:
                    students.add(i,student2);
                    break;
                case 2:
                    students.add(i,student3);
                    break;
                case 3:
                    students.add(i,student4);
                    break;
                case 4:
                    students.add(i,student5);
                    break;
                case 5:
                    students.add(i,student6);
                    break;
                case 6:
                    students.add(i,student7);
                    break;
                case 7:
                    students.add(i,student8);
                    break;
                case 8:
                    students.add(i,student9);
                    break;
                case 9:
                    students.add(i,student10);
                    break;
            }
        }
        for (int i=0;i<students.size();++i) {
            System.out.println(students.get(i).toString());
            System.out.println();
        }


        Teacher teacher1=new Teacher(1,"khokon","math",300);
        Teacher teacher2=new Teacher(1,"khokon","math",300);



    }












}
