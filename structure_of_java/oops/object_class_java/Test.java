package structure_of_java.oops.object_class_java;

/**
 * Created by ri on 2/16/17.
 */
public class Test {
    public static void main(String args[]) throws CloneNotSupportedException {
        Vehicle car=new Vehicle(4,1600,120);
        Vehicle bus=new Vehicle(6,2880,100);

        System.out.println(car.equals(bus));
        Vehicle v;
       // v=(Vehicle) bus.clone();
        v = (Vehicle) car.clone();
        System.out.println(v.equals(car));
        System.out.println(v.getChaka());
        System.out.println(v.getSpeed());
        System.out.println(v.getWeight());

    }
}
