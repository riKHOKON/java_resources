package schildt_proj.Exception_Handling.mini_projs;

/**
 * Created by RI on 6/2/2017.
 * Demonstrate the Queue Exception
 */
public class QExcDemo {
    public static void main(String args[]){
        FixedQueue q = new FixedQueue(26);
        char ch;
        try {
            // over run the Queue
            for (int j = 0; j < 27; j++) {
                System.out.print("Attempting to Store : "+(char)('A'+j));
                q.put((char)('A'+j));
                System.out.println("-----OK");
            }
            System.out.println();
        } catch (QueueFullException e) {
            System.out.println(e);
        }
        System.out.println();
        try {
            // over empty the queue
            for (int j = 0; j < 26 ; j++) {
                System.out.print("Getting next char : ");
                ch = q.get();
                System.out.println(ch);
            }
        }catch (QueueEmptyException e){
            System.out.println(e);
        }
    }
}
