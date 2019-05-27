package schildt_proj.ControlStatements_3;

/**
 * Created by rashedulislam on 22-12-16.
 * We also can use nested switch
 */
public class NestedSwitch {
    public static void main(String args[]){
        char ch = 'a';
        for (ch = 'a'; ch < 'e';++ch){
            switch (ch){
                case 'a':
                    System.out.println("This a is a part of outer switch.");
                    switch (ch) {
                        case 'b':
                            System.out.println("This is inner switch and the value is now " + ch);
                            break;
                    }break;
            }
        }
    }
}
