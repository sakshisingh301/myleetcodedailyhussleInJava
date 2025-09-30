public class SubarrayProductLessThanK {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        int count=0;
        int start=0;
        int end=0;
        int product=1;
        while(end<nums.length)
        {
            product=product*nums[end];

            while(product>=k)
            {
                product=product/nums[start];
                start++;


            }
            count=count+(end-start)+1;


            end++;
        }
        return count;

    }

    public static void main(String[] args) {
        int [] nums = {1,1,1};
        int k = 1;
        System.out.println(numSubarrayProductLessThanK(nums,k));

    }
}
