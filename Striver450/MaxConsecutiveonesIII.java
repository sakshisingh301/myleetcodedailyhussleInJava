public class MaxConsecutiveonesIII {

    public int longestOnes(int[] nums, int k) {

      int left=0;
      int right=0;
      int zeros=0;
      int max=0;

      while(right<nums.length)
      {

          if(nums[right]==0)
          {
              zeros++;
          }
          while(zeros>k)
          {
              if(nums[left]==0)
              {
                  zeros--;
              }
              left++;
          }
          max=Math.max(max,right-left+1);

          right++;
      }
      return max;
    }


    public static void main(String[] args) {
      int []  nums = {1,1,1,0,0,0,1,1,1,1,0};
      int k = 2;
    }
}
