import java.util.Arrays;
import java.util.HashMap;

public class Count_Subarrays_Where_Max_Element_Appears_at_Least_K_Times {


        public static long countSubarrays(int[] nums, int k) {
            int maxi = Integer.MIN_VALUE;
            for (int num : nums) maxi = Math.max(maxi, num);
            int left = 0;
            long maxiOccurence = 0;
            long res = 0;
            for (int right = 0; right < nums.length; right++) {
                if (nums[right] == maxi) maxiOccurence++;
                while (maxiOccurence >= k) {
                    if (nums[left] == maxi) maxiOccurence--;
                    left++;
                }
                res += left;
            }
            return res;
        }


    public static void main(String[] args) {
        int [] nums = {1,3,2,3,3};
        int k = 2;
        System.out.println(countSubarrays(nums,k));

    }
}
