package schildt_proj.try_this.help_system;

/**
 * Created by ri on 1/20/17.
 */
public class HelpClassDemo {
    public static void main(String args[])
            throws java.io.IOException{
        char choice,ignore = 0;

        Help help = new Help();

        for (;;){

            do {
                help.showMenu();
                choice = (char)System.in.read();
                do {
                    ignore = (char)System.in.read();
                }while (ignore != '\n');
                System.out.println("\n");
            }while (!help.isValid(choice));
            if (choice == 'q'){
                System.out.println("Good bye!");
                break;
            }
            System.out.println("\n");
            help.helpOn(choice);
        }
    }
}
