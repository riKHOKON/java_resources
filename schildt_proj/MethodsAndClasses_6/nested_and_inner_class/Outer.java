package schildt_proj.MethodsAndClasses_6.nested_and_inner_class;

/**
 * Created by ri on 1/26/17.
 * use an inner class
 */
public class Outer {
    private int nums[];
    Outer(int n[]){
        nums = n;
    }
    void analize(){
        Inner inob = new Inner();
        System.out.println("Maximum of numbers is :"+inob.max());
        System.out.println("Minimum of numbers is :"+inob.min());
        System.out.println("Average of numbers is :"+inob.avg());
    }


    // this is an inner class
    class Inner{

        int min(){
            int m = nums[0];
            for (int i = 0; i < nums.length; ++i)
                if (nums[i] < m)m = nums[i];
            return m;
        }
        int max(){
            int m = nums[0];
            for (int i = 0; i < nums.length; ++i)
                if (nums[i] > m)m = nums[i];
            return m;
        }
        int avg(){
            int a = 0;
            for (int i = 0; i < nums.length; ++i)
                a += nums[i];
            return a/nums.length;
        }
    }
}
