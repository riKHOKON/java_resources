package structure_of_java.oops.access_modifiers;

/**
 * Created by ri on 2/16/17.
 */
public class MyClass {

    private int number;

    public MyClass(int number) {
        this.number = number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    /*
    public static void main(String args[]){
        MyClass classType=new MyClass(1);
        System.out.println(classType.number);
        classType.number=190;
        System.out.println(classType.number);

    }
*/
}
