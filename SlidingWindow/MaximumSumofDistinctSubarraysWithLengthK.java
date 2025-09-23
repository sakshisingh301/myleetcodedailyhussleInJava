import java.util.HashSet;

public class MaximumSumofDistinctSubarraysWithLengthK {

    public static long maximumSubarraySum(int[] nums, int k) {

        int left=0;
        int right=0;
        int sum=0;
        int max=0;
        while (right< nums.length)
        {
            HashSet<Integer> set=new HashSet<>();
            sum=sum+nums[right];

            if(right-left+1==k)
            {
                if(set.size()==right-left+1)
                {
                    max=Math.max(sum,max);

                }
                sum=sum-nums[left];
                set.remove(nums[left]);
                left++;

            }
            set.add(nums[right]);
            right++;
        }
        return max;

    }

    public static void main(String[] args) {
        int []nums = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums,k));

    }
}
