package structure_of_java.oops.final_keyword.variable;

/**
 * Created by ri on 2/11/17.
 */
public class Bike {
    final int speedLimit=90;
    void run(){
        //speedLimit=400; final variable can't be changed.
        System.out.println("Running but speed can't be changed.");
    }
    public static void main(String args[]){
        Bike myBike=new Bike();
        myBike.run();
    }
}
