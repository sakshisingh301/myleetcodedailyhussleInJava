import java.util.LinkedList;
import java.util.Queue;

public class FindthePowerofKSizeSubarraysI {



    public static int[] resultsArray(int[] nums, int k) {

        int consecutive=1;
        int n= nums.length;
        int left=0;
        int [] result=new int[n-k+1];
        int i=0;

        for(int right=1;right<nums.length;right++)
        {
            if(nums[right]>nums[right-1] && nums[right]-nums[right-1]==1)
            {
                consecutive++;

            }
            if(right-left+1==k)
            {
                if(consecutive==k)
                {
                    result[i]=nums[right];
                }
                else {
                    result[i]=-1;
                }
                i++;
                if(nums[left]<nums[left+1] && nums[left+1]-nums[left]==1)
                {
                    consecutive--;
                }
                left++;

            }
        }
        return result;



    }

    public static void main(String[] args) {
        int [] nums = {1};
        int k = 1;
        System.out.println(resultsArray(nums,k));

    }
}