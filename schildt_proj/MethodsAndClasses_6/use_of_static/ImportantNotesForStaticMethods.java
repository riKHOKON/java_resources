package schildt_proj.MethodsAndClasses_6.use_of_static;

/**
 * Created by ri on 1/26/17.
 */
public class ImportantNotesForStaticMethods {
    public static void main(String args[]){
        System.out.println("Methods declared as static have several restrictions---");
        System.out.println("\t1.They can directly call only other static methods.");
        System.out.println("\t2.They can directly access only static data.");
        System.out.println("\t3.They do not have 'this' reference.");
    }
}
