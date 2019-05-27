package structure_of_java.oops.object_class_java;

/**
 * Created by ri on 2/16/17.
 */
public class Vehicle extends Object implements Cloneable {
    private int chaka;
    private int weight;
    private int speed;
    public Vehicle(int chaka, int weight, int speed) {
        this.chaka = chaka;
        this.weight = weight;
        this.speed = speed;
    }

    public int getChaka() {
        return chaka;
    }
    public int getWeight() {
        return weight;
    }
    public int getSpeed() {
        return speed;
    }
    public void setChaka(int chaka) {
        this.chaka = chaka;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
