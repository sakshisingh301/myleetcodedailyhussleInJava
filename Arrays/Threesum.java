package ArraysQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Threesum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {

            int curr=nums[i];
            int target=-curr;
            if(i>0 && curr==nums[i-1])
            {
                continue;
            }
          two_sum(i,nums,target,res);

            if(curr>0) {
                break;
            }


        }
        return res;

    }

    public static void two_sum(int i, int [] nums, int target,List<List<Integer>> res) {
        HashSet<Integer> seen =new HashSet<>();

        for(int x=i+1;x<nums.length;x++)
        {
            int complement=target-nums[x];
            if(seen.contains(complement))
            {

                List<Integer> triplet = Arrays.asList(nums[i], nums[x], complement);
                res.add(triplet);
                while (x + 1 < nums.length && nums[x] == nums[x+ 1]) x++;

            }
            seen.add(nums[x]);
        }


    }




    public static void main(String[] args) {
        int [] nums ={0,0,0,0};
        //-4,-1,-1,0,1,2
        System.out.println(threeSum(nums));

    }
}
