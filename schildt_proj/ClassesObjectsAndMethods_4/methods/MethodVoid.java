package schildt_proj.ClassesObjectsAndMethods_4.methods;

/**
 * Created by ri on 1/25/17.
 * This method doesn't return a value
 */
public class MethodVoid {
    public static void main(String rgs[]){
        Heading("Rashedul Islam","25/01/2017");
    }
    static void Heading(){
        System.out.println("***************************");
        System.out.println("**   Rashedul Islam      **");
        System.out.println("***************************");
    }
    // void method also can have parameter
    static void Heading(String name,String date){
        System.out.println("***************************");
        System.out.println("**   "+name+"      **");
        System.out.println("**\t\t"+date+"\t\t **");
        System.out.println("***************************");
    }
}
