import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Union_of_two_sorted_array {

    public static int[] unionArray(int[] nums1, int[] nums2) {

        LinkedHashSet<Integer> hashSet=new LinkedHashSet<>();


        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if( nums1[i]<=nums2[j])
            {
                hashSet.add(nums1[i]);
                i++;

            }
            else {
                hashSet.add(nums2[j]);
                j++;

            }

        }

        while(i<nums1.length)
        {
            hashSet.add(nums1[i]);
            i++;

        }

        while(j<nums2.length)
        {
            hashSet.add(nums2[j]);
            j++;

        }
        int [] temp=new int[hashSet.size()];
        int n=0;
        for(int num:hashSet)
        {
            temp[n]=num;
            n++;
        }


        return temp;

    }

    public static void main(String[] args) {

       int [] nums1 = {1, 2, 3, 4, 5};
       int [] nums2 = {1, 2, 7};
       System.out.println(unionArray(nums1,nums2));

    }
}
