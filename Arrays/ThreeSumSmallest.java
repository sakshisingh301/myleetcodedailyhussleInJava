package ArraysQuestion;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class ThreeSumSmallest {

    public static int threeSumSmaller(int[] nums, int target) {

        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            count=count+twoPointer(nums,i,target,count);

        }
        return count;

    }

    private static int twoPointer(int[] nums, int i, int target,int count) {
        int start=i+1;
        int end=nums.length-1;
        count=0;

        while(start<end)
        {
            int curr_sum=nums[i]+nums[start]+nums[end];
            if(curr_sum<target)
            {
                count=count+(end-start);
                start++;

            }
            else {
                end--;
            }


        }
        return count;


    }


    public static void main(String[] args) {
        int [] nums = {3,1,0,-2};
        int target = 4;
        //{-2,0,1,3}
        System.out.println(threeSumSmaller(nums,target));

    }
}
