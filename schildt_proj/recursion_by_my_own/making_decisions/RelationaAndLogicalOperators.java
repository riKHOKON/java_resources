package schildt_proj.recursion_by_my_own.making_decisions;

public class RelationaAndLogicalOperators
{
   public static void main(String[] args)
   {
   /*
      && - And logical operator
      || - Or logical operator
   */
      int hoursWorked = 39;
      int salary = 47000;
      System.out.println((hoursWorked > 40) && (salary <= 50000));
      String password = "GUEST";
      System.out.println((password == "guest") || (password == "GUEST"));
   }
}