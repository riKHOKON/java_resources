package schildt_proj.try_this.queue;

/**
 * Created by ri on 1/22/17.
 */
public class QueueDemo {
    public static void main(String args[]){
        /*

        Queue smallQ = new Queue(4);
        Queue bigQ = new Queue(100);

        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        // put some numbers in bigQ
        for (i = 0; i < 26; ++i){
            bigQ.put((char)('A'+i));
        }
        // retrieve the elements form bigQ
        System.out.print("Contents of bigQ: ");
        for (i = 0; i < 26; ++i){
            ch = bigQ.get();
            if (ch != (char)0)
                System.out.print(ch+" ");
        }
        System.out.println("\n");
        System.out.println("Using the smallQ to generate errors");
        for (i = 0; i < 5; i++){
            System.out.print("Attempting to store "+(char)('Z'-i));
            smallQ.put((char)('Z'-i));
            System.out.println();
        }
        System.out.println();

        // more errors on smallQ
        System.out.print("Contents of smallQ :");
        for (i = 0; i < 5; ++i){
            ch = smallQ.get();
            if (ch != (char)0)
                System.out.print(ch+" ");
        }
        */


        /*
        Queue test = new Queue(10);
        test.q[0] = 99 wrong as q is private
        test.putloc = -100; will not work also.
        */
/*

        System.out.println("This test is for Queue2");
        Queue2 smallIntQ = new Queue2(4);
        Queue2 bigIntQ = new Queue2(100);


        System.out.println("Using bigIntQ to store the integers.");
        // put some numbers in bigIntQ
        for (i = 0; i < 99; ++i){
            bigIntQ.put('A'+i);
        }
        // retrieve the elements form bigQ
        System.out.print("Contents of bigIntQ: ");
        for (i = 0; i < 99; ++i){
            ch = bigQ.get();
            if (ch != (char)0)
                System.out.print(ch+" ");
        }
*/

        // construct 10- element empty queue
        Queue q1 = new Queue(10);

        char[] name = {'T','O','M'};
        // construct queue from array
        Queue q2 = new Queue(name);

        char ch;
        int i;
        // put some characters in q1
        for (i = 0; i < 10; ++i)
            q1.put((char)('A'+i));
        // construct queue from bookpackext queue
        Queue q3 = new Queue(q1);
        // showInfo the queues

        System.out.println("Contents of q1:");
        for (i = 0;i < 10; ++i) {
            ch = q1.get();
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("Contents of q2:");
        for (i = 0;i < 3; ++i) {
            ch = q2.get();
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("Contents of q3:");
        for (i = 0;i < 10; ++i) {
            ch = q3.get();
            System.out.print(ch+" ");
        }
    }
}
