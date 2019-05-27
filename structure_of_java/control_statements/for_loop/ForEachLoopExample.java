package structure_of_java.control_statements.for_loop;

/**
 * Created by ri on 2/5/17.
 */
public class ForEachLoopExample {
    public static void main(String args[]){
        int arr[] = new int[10];
        for (int i=0;i<arr.length;++i)
            arr[i]=i*3;
        for (int a:arr) {
            System.out.print(a+"\t");
        }
    }
}
