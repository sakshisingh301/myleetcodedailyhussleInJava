package ArraysQuestion;

import java.util.Arrays;

public class MergeSortedArray {

    public static int [] merge(int[] nums1, int m, int[] nums2, int n) {

        int pointer1=0;
        int pointer2=0;
        int k=0;
        int [] nums1copy=new int[m];
        for(int i=0;i<nums1copy.length;i++)
        {
            nums1copy[i]=nums1[i];
        }

        while (pointer1<m &&pointer2<n)
        {
            if(nums1copy[pointer1]<=nums2[pointer2])
            {
                nums1[k]=nums1copy[pointer1];
                k++;
                pointer1++;
            }
            else {
                nums1[k]=nums2[pointer2];
                k++;
                pointer2++;
            }

        }
        while (pointer2<n)
        {
            nums1[k]=nums2[pointer2];
            k++;
            pointer2++;
        }
        while (pointer1<m)
        {
            nums1[k]=nums1copy[pointer1];
            k++;
            pointer1++;
        }

        return nums1;


    }

    public static void main(String[] args) {

       int []  nums1 = {1,2,3,0,0,0};
       int m = 3;
       int [] nums2 = {2,5,6};
       int n = 3;
       System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));

    }
}
