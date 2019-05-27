package structure_of_java.oops.interface_java.java_interface_example_bank;

/**
 * Created by rashedulislam on 2/13/2017.
 */
public interface Bank {
    float printAmountOfInterest();
    static void main(String args[]){
       Bank sonaliBank=new Sonali();
        System.out.println("Interest rate of Sonali bank is : "+sonaliBank.printAmountOfInterest());
    }
}
