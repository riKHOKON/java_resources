package structure_of_java.oops.interface_java.default_method_with_body_in_interface;
/**
 * Created by rashedulislam on 2/15/2017.
 */
public class Run implements Greetings {
    @Override
    public void print() {
        System.out.println("Go for new work.........");
    }
    /*
    @Override
    public void showInfo() {
        System.out.println("welcome again.");
    }
    */
    // main method
    public static void main(String args[]){
        Run run=new Run();
        run.show();
        System.out.println();
        run.print();

    }
}
