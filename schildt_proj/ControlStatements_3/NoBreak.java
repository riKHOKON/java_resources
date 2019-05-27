package schildt_proj.ControlStatements_3;

/**
 * Created by rashedulislam on 22-12-16.
 * Switch without break
 */
public class NoBreak {
    public static void main(String args[]){
        int i = 0;
        for (i = 0;i < 6;++i) {
            switch (i) {
                case 1:
                    System.out.println("i is now in case one and value is :" + i);
                case 2:
                    System.out.println("i is now in case two and value is :" + i);
                case 3:
                    System.out.println("i is now in case three and value is :" + i);
                case 4:
                    System.out.println("i is now in case four and value is :" + i);
            }
            System.out.println();
        }
    }
}
