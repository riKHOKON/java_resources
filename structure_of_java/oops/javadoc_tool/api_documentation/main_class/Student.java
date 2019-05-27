package structure_of_java.oops.javadoc_tool.api_documentation.main_class;

public class Student{
    private String name;
    private int cl;
    
    public Student(String name,int c){
      this.name=name;
      this.cl=c;  
    }
    public String toString(){
      return name+"\n";
    }
}
