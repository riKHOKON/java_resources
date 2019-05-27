package schildt_proj.Package_And_Interface_8.implementing_interface;

/**
 * Created by RI on 5/30/2017.
 */
public class SeriesDemo2 {
    public static void main(String args[]){
        ByTows twoOb = new ByTows();
        ByThrees threeOb = new ByThrees();
        Series ob;

        for (int i = 0; i < 5; i++) {
            ob = twoOb;
            System.out.println("Next ByTwo value is "+ob.getNext());
            ob = threeOb;
            System.out.println("Next ByThree value is "+ob.getNext());
        }


    }
}
