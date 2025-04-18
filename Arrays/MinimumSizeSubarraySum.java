package ArraysQuestion;

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {

        int minValueLength=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int sum=0;
        boolean [] visited=new boolean[nums.length];

        while (j<nums.length)
        {

                sum=sum+nums[j];
                visited[j]=true;
                if(sum<target)
                {

                    j++;

                }
                else if(sum>=target)
                {
                    while (sum>=target) {
                        minValueLength = Math.min(minValueLength, j - i + 1);
                        sum = sum - nums[i];
                        i++;
                    }
                    j++;

                }

            }


        return minValueLength==Integer.MAX_VALUE?0:minValueLength;

    }

    public static void main(String[] args) {
        int target = 11;
        int [] nums = {1,1,1,1,1,1};
        System.out.println(minSubArrayLen(target,nums));
    }
}
