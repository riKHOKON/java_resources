package structure_of_java.oops.this_keyword;

class S2{

  void m(S2 obj){
    System.out.println("method is invoked");
  }  

  void p(){
    m(this);
  }  

  public static void main(String args[]){
    S2 s1 = new S2();
    s1.p();
  }  
}  