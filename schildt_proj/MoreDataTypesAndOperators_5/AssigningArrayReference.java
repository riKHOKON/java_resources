package schildt_proj.MoreDataTypesAndOperators_5;
/**
 * Created by ri on 1/21/17.
 * Assigning array reference variables
 */
public class AssigningArrayReference {
    public static void main(String args[]){
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];
        for (i = 0; i < 10; ++i)
            nums1[i] = i;
        for (i = 0; i < 10; ++i)
            nums2[i] = -i;
        System.out.printf("Here is nums1: ");
        for (i = 0; i < 10; ++i)
            System.out.print(nums1[i]+" ");
        System.out.println();
        System.out.printf("Here is nums2: ");
        for (i = 0; i < 10; ++i)
            System.out.print(nums2[i]+" ");
        System.out.println();

        nums2 = nums1; // now nums2 refers to nums1.
        // let's print nums2 once again and see what's the difference
        System.out.printf("Here is nums2 after assignment: ");
        for (i = 0; i < 10; ++i)
            System.out.print(nums2[i]+" ");
        System.out.println();

        // let's change any of this and see
        nums2[5] = 2323;
        // let's print the nums1 once again
        System.out.printf("Here is nums1 after assignment in nums2: ");
        for (i = 0; i < 10; ++i)
            System.out.print(nums1[i]+" ");
        System.out.println();
    }
}
