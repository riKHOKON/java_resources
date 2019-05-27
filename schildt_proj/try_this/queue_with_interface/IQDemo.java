package schildt_proj.try_this.queue_with_interface;

/**
 * Created by RI on 5/30/2017.
 */
public class IQDemo {
    public static void main(String args[]){
        FixedQueue q1 = new FixedQueue(10);
        CircularQueue q2 = new CircularQueue(10);
        DynamicQueue q3 = new DynamicQueue(10);

        ICharQ iq;
        iq = q1;



//        System.out.println("Putting some values to the FixedQueue.");
//        for (int i = 0; i < 10 ; i++) {
//            iq.put((char) ('A'+i));
//        }
//        System.out.println("Showing contents of the FixedQueue.");
//        for (int i = 0; i < 10; i++) {
//            System.out.print(iq.get()+" ");
//        }
//        System.out.println();
//
//        iq = q2;
//
//        System.out.println("Putting some values to the CircularQueue.");
//        for (int i = 0; i < 10 ; i++) {
//            iq.put((char) ('Z'- i));
//        }
//        System.out.println("Showing contents of the CircularQueue.");
//        for (int i = 0; i < 10; i++) {
//            System.out.print(iq.get()+" ");
//        }
//        System.out.println();

        iq = q3;

        System.out.println("Putting some values to the DynamicQueue.");
        for (int i = 0; i < 10 ; i++) {
            iq.put((char) ('A'+ i));
        }
        System.out.println("Showing contents of the DynamicQueue.");
        for (int i = 0; i < 10; i++) {
            System.out.print(iq.get()+" ");
        }
        System.out.println();


        System.out.println("Putting more values to the DynamicQueue.");
        for (int i = 0; i < 20 ; i++) {
            iq.put((char) ('H'+ i));
        }
        System.out.println("Showing contents of the DynamicQueue.");
        for (int i = 0; i < 20; i++) {
            System.out.print(iq.get()+" ");
        }
        System.out.println();



    }

}
