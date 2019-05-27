package java_basic.object_and_classes;
public class Test6
{
   public static void main(String[] args) 
   {
      Time theTime = new Time(9,0,1);
      Time aTime = new Time(9,0,0);
      if (theTime.equals(aTime))
         System.out.println("The same time");
      else
         System.out.println("Different time");
   }
}