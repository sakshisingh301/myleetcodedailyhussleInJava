public class Subarray_Sum_Equals_K {

    public static int subarraySum(int[] nums, int k) {

        int count=0;
        int i=0;
        int j=0;
        int sum=0;
        while(j<nums.length)
        {
            sum=sum+nums[j];
            if(sum<k)
            {
                j++;
            }
            else if(sum==k)
            {
                count++;
               sum=sum-nums[i];
               i++;
               j++;
            }
            else {
                sum=sum-nums[i];
                i++;


            }

        }
        return count;

    }

    public static void main(String[] args) {
        int [] nums = {1,2,3};
        int k = 3;
        System.out.println(subarraySum(nums,k));
    }
}
