package structure_of_java.oops.final_keyword.method_final;

/**
 * Created by ri on 2/11/17.
 */
public class Honda extends Bike {
    /*
    void run(){
         System.out.println("running safely with 100kmph");
     }
     we can't override final method
     */
    public static void main(String args[]){
        Honda honda= new Honda();
        honda.run();
    }
}
