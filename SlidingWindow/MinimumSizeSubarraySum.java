public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {

        int start=0;
        int end=0;
        int sum=0;
        int min_length=Integer.MAX_VALUE;
        while(end<nums.length)
        {
            sum=sum+nums[end];
            if(sum<target)
            {
                end++;
            }
            else
            {
                while(sum>=target)
                {
                    min_length=Math.min(min_length,end-start+1);
                    sum=sum-nums[start];
                    start++;
                }
                end++;

            }


        }
        return min_length;
    }

    public static void main(String[] args) {
        int  target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target,nums));

    }
}
