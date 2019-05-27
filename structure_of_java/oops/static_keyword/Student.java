package structure_of_java.oops.static_keyword;

class Student {

    int rollno;
    String name;
    static String college ="Ulipur MS school and college";
     
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    void display (){System.out.println(rollno+" "+name+" "+college);}
  
    public static void main(String args[]){
        Student s1 = new Student(111,"Rashedul Islam");
        Student s2 = new Student(222,"Arif Mia");
   
        s1.display();
        s2.display();
    }
}  