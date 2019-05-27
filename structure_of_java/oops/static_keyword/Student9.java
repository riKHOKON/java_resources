package structure_of_java.oops.static_keyword;

class Student9{

    int rollno;
    String name;
    static String college = "ITS";
       
    static void change(){
     college = "BBDIT";  
     }  
  
    Student9(int r, String n){
        rollno = r;
        name = n;
    }
  
    void display (){
        System.out.println(rollno+" "+name+" "+college);
    }
  
    public static void main(String args[]){
        Student9 s1 = new Student9 (111,"Karan");
        s1.display();
        /*
            static method can be called without creating object type
            and also can change static variables value
        */
        Student9.change();
        Student9 s2 = new Student9 (222,"Aryan");
        Student9 s3 = new Student9 (333,"Sonoo");

        s2.display();
        s3.display();
    }  
}  