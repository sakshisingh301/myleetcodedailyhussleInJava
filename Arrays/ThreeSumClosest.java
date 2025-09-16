package ArraysQuestion;

import java.util.Arrays;

public class ThreeSumClosest {

    public  int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int closestNum=nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length-2;i++)
        {
            closestNum=twoPointers(nums,i,target,closestNum);
        }
        return closestNum;

    }

    private  int twoPointers(int [] nums,int fixed,int target,int initialSum)
    {
        int start=fixed+1;
        int end=nums.length-1;

        while(start<end)
        {
            int currTarget=nums[fixed]+nums[start]+nums[end];
            int currAbsoluteValue=Math.abs(target-currTarget);


            if(Math.abs(target-initialSum)>currAbsoluteValue) {
                initialSum = currTarget;

            }

            if(currTarget<target)
            {
                start++;
            }
            else if(currTarget>target)
            {
                end--;
            }
            else {
                return currTarget;
            }
            
        }
        return initialSum;



    }

    public static void main(String[] args) {
       int [] nums = {-1,2,1,-4};
       //{-4,-1,1,2}
       int target = 1;


    }
}
