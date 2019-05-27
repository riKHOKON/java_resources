package structure_of_java.oops.instance_initializer_block.sample2;

/**
 * Created by ri on 2/11/17.
 */
public class Bike {
    int speed;
    Bike(){
        System.out.println("Constructor is invoked");
    }
    {
        System.out.println("Instance initializer block invoked");
    }


    public static void main(String args[]){
        Bike b1=new Bike();
        Bike b2=new Bike();
    }
}
