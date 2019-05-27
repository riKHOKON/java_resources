package schildt_proj.ClassesObjectsAndMethods_4;

/**
 * Created by ri on 1/20/17.
 * Using the method of class ChkNum
 */
public class ParameterDemo {
    public static void main(String args[]){
        ChkNum e = new ChkNum();
        if (e.isEven(10)){
            System.out.println("Ten is even number");
        }
        if (e.isEven(9)){
            System.out.println("Nine is even number");
        }
        if (e.isEven(20)){
            System.out.println("Twenty is even number");
        }

    }
}
