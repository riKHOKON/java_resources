package schildt_proj.Package_And_Interface_8.implementing_interface;

/**
 * Created by RI on 5/30/2017.
 */
public class SeriesDemo {
    public static void main(String args[]){

        ByTows ob = new ByTows();
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is "+ob.getNext());
        }
        // reset again
        System.out.println("\nResetting");
        ob.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is "+ob.getNext());
        }
        System.out.println("\nStarting at 100");
        ob.setStart(51);
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is "+ob.getNext());
        }


    }
}
