package schildt_proj.try_this.help_system;

/**
 * Created by rashedulislam on 23-12-16.
 */
public class Help2 {
    public static void main(String args[])
            throws java.io.IOException
    {
        char choice,ignore;
        do {
            System.out.println("Help on :");
            System.out.println("\t1. if\n\t2. switch\nchoose one");
            choice = (char)System.in.read();
            do {
                ignore = choice = (char)System.in.read();
            }while (ignore != '\n');
        }while (choice < '1' | choice > '2');
        System.out.println(

        );
        switch(choice) {
            case '1':
                System.out.println("The if :\n");
                System.out.println("if(expression) \n\tstatement;");
                System.out.println("else \n\tstatement;");
                break;
            case '2':
                System.out.println("The switch : \n");
                System.out.println("switch(expression){");
                System.out.println("\tcase constant :");
                System.out.println("\t\tstatement;");
                System.out.println("\t\tbreak;");
                System.out.println("\tcase constant2 :");
                System.out.println("\t\tstatement;");
                System.out.println("\t\tbreak;");
                System.out.println("\tdefault :");
                System.out.println("\t\tstatement;");
                System.out.println("}");
                break;
            default :
                System.out.println("Selection not found !");
        }
    }
}
