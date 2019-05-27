package schildt_proj.ControlStatements_3;

/**
 * Created by rashedulislam on 22-12-16.
 * Evaluating switch
 */
public class SwitchDemo {
    public static void main(String args[]){
        int i = 0;
        for (i = 0;i < 5;++i){
            switch (i){
                // we also can have empty cases like case 0
                case 0:
                    break;
                case 1:
                    System.out.println("i is now in case one and value is :"+i);
                    break;
                case 2:
                    System.out.println("i is now in case two and value is :"+i);
                    break;
                case 3:
                    System.out.println("i is now in case three and value is :"+i);
                    break;
                case 4:
                    System.out.println("i is now in case four and value is :"+i);
                    break;
            }
            System.out.println();
        }
    }
}
