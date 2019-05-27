package structure_of_java.oops.abstract_class.another_example;

/**
 * Created by ri on 2/11/17.
 */
public class Tester {
    public static void main(String args[]){
        Bank b;
        b=new SonaliBank();
        System.out.println("Interest rate of Sonali Bank is "+b.getInterestRate()+"%");
        b=new RupaliBank();
        System.out.println("Interest rate of Rupali Bank is "+b.getInterestRate()+"%");
    }
}
