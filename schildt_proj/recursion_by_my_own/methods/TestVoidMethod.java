package schildt_proj.recursion_by_my_own.methods;
/*
   Void method
* */
public class TestVoidMethod {
   public static void main(String[] args) {
      Heading("Jones", "6/6/11");
   }

   static void Heading(String name, String date) {
      System.out.println("**************");
      System.out.println("*  " + name + "   *");
      System.out.println("*  " + date + "   *");
      System.out.println("**************");
   }
}