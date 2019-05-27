package schildt_proj.try_this.varargs;

/**
 * Created by ri on 1/25/17.
 */
public class Main {
    public static void main(String args[]){
        int result = display(4,4,5,4,3,6,7,8,10);
        System.out.println();
        System.out.println("the sum is : "+result);
        System.out.println();
        display("khokon","rashedul","zaidul");

    }
    static int display(int ... a){
        int sum = 0;
        for (int i : a){
            System.out.print(i+" ");
            sum += i;
        }
        return sum;
    }
    static void display(String ... a){
        for (String i : a)
            System.out.print(i+" ");
    }
}
