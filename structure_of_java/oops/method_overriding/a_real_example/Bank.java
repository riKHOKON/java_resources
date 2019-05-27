package structure_of_java.oops.method_overriding.a_real_example;

/**
 * Created by ri on 2/11/17.
 */
public class Bank {
    int getInterestRate(){return 0;}
    public static void main(String args[]){
        SonaliBank sonalibank=new SonaliBank();
        IFICIBank ificibank=new IFICIBank();
        Janatabank janatabank=new Janatabank();

        System.out.println("Interest rate of Sonali Bank is "+sonalibank.getInterestRate());
        System.out.println("Interest rate of Janata Bank is "+janatabank.getInterestRate());
        System.out.println("Interest rate of Ifici Bank is "+ificibank.getInterestRate());

    }
}
