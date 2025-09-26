package ArraysQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i< nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j< nums.length;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                long curr_sum=nums[i]+nums[j];
                twoPointer(nums,i,j,list,curr_sum, target);
            }

        }
        return list;
    }

    private void twoPointer(int [] nums,int i,int j, List<List<Integer>>  res, long curr_sum, int target)
    {
        int start=j+1;
        int end=nums.length-1;

        while (start<end)
        {
            long curr_target=nums[start]+nums[end]+curr_sum;
            if(curr_target<target)
            {
                start++;
            }
            else if(curr_target>target)
            {
                end--;
            }
            else {

                List<Integer> quadralets = Arrays.asList(nums[i], nums[j], nums[start],nums[end]);
                res.add(quadralets);
                while(start<nums.length-1 &&nums[start]==nums[start+1])
                {
                    start++;
                }
                while(end!=0 &&nums[end]==nums[end-1])
                {
                    end--;
                }
                start++;
                end--;

            }

        }

    }



    public static void main(String[] args) {
        int [] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        //System.out.println(fourSum(nums,target));

    }
}
