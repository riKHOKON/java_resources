package java_basic.polymorphism.simple_example;

/**
 * Created by ri on 2/11/17.
 */
public class Honda extends Bike {

    void run(){
        System.out.println("Running safely.");
    }

    public static void main(String args[]){
        Bike myHonda=new Honda();
        myHonda.run();
    }
}
