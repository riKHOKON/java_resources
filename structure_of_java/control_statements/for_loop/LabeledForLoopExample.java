package structure_of_java.control_statements.for_loop;

/**
 * Created by ri on 2/5/17.
 */
public class LabeledForLoopExample {
    public static void main(String[] args) {
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    System.out.println("label bb breaks now.");
                    break bb;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
