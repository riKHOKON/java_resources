package schildt_proj.MethodsAndClasses_6.use_of_static;

/**
 * Created by ri on 1/26/17.
 * Using a static variable to understand its uses
 * Important NOTE: We can access static variable through its class name with a dot operator
 *                  class, methods,variables can be static
 *                  There are some variations available for 'static' we would see them one by one
 */
class StaticVariableDemo {

    int x; // normal variable
    static int y; // a static variable

    /*Return the sum of the instance variables x and
    * the static variable y */
    int sum(){
        return x + y;
    }


    /*Main method began here*/
    public static void main(String args[]){
        StaticVariableDemo ob1 = new StaticVariableDemo();
        StaticVariableDemo ob2 = new StaticVariableDemo();

        // Each object has its own copy of an instance variable
        ob1.x = 10;
        ob2.x = 20;
        System.out.println("Of course, ob1.x and ob2.x "+
        " are independent.");
        System.out.println("ob1.x :"+ob1.x+"" +
                "\nob2.x : "+ob2.x);
        System.out.println();
        // Each object shares one copy of a static variable.
        System.out.println("The static variable y is shared.");
        StaticVariableDemo.y = 19;
        System.out.println("Set StaticVariableDemo.y = 19.");

        System.out.println("ob1.sum() : "+ob1.sum());
        System.out.println("ob2.sum() : "+ob2.sum());

        StaticVariableDemo.y = 19;
        System.out.println("Change StaticVariableDemo.y to = 100.");

        System.out.println("ob1.sum() : "+ob1.sum());
        System.out.println("ob2.sum() : "+ob2.sum());
        System.out.println();
    }
}
