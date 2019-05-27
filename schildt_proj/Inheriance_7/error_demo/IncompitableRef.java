package schildt_proj.Inheriance_7.error_demo;

/**
 * Created by RI on 5/28/2017.
 */
public class IncompitableRef {
    public static void main(String args[]){
//
//        X x = new X(5);
//        X x2;
//
//        Y y = new Y(2);
//
//        x2 = x;
//        System.out.println(x.a);
//        /*
//        *
//        * x2 = y;
//        * this is incompiteble type
//        *
//        * */



        X x = new X(5);
        X x2;

        Y y = new Y(2,3);

        x2 = x;

        System.out.println(x.a);
        x2 = y;
        System.out.println(x2.a); // this is O.K
        /*
            x2.b is invalid as x2 doesn't have b member.
         */
    }
}
