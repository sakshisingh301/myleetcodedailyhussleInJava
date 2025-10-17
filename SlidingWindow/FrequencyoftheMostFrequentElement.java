import java.util.Arrays;

public class FrequencyoftheMostFrequentElement {

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int maxFrequency=1;
        int left=0;
        int right=0;
        long curr_sum=0;

        while(right<nums.length)
        {
            curr_sum=curr_sum+nums[right];
            long ideal_sum=(long) nums[right]*(right-left+1);
            while(ideal_sum-curr_sum>k)
            {
                curr_sum=curr_sum-nums[left];
                left++;
                ideal_sum=(long)nums[right]*(right-left+1);

            }

            maxFrequency=Math.max(maxFrequency,right-left+1);
            right++;
        }

        return maxFrequency;

    }

    //Arrays.sort(nums);
    //
    //        int i=0;
    //        int j=i+1;
    //        int maxFrequency=1;
    //
    //        while(j<nums.length)
    //        {
    //            int prev=nums[j-1];
    //            int curr=nums[j];
    //            int diff=curr-prev;
    //
    //            if(diff<k)
    //            {
    //                k=k-j*diff;
    //                maxFrequency=Math.max(maxFrequency,j-i+1);
    //
    //                j++;
    //            }
    //            else {
    //                i++;
    //                j++;
    //            }


    public static void main(String[] args) {
        int [] nums = {1,2,4};
        int k = 5;
        System.out.println(maxFrequency(nums,k));

    }
}
