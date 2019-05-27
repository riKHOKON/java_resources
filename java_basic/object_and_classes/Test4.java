package java_basic.object_and_classes;

public class Test4
{
   public static void main(String[] args)
   {
      Time theTime = new Time(9,0,0);
      System.out.println(theTime.display());
      theTime.increment(1);
      System.out.println(theTime.display());
      theTime.increment(30);
      System.out.println(theTime.display());
      theTime.increment(40);
      System.out.println(theTime.display());
   }
}