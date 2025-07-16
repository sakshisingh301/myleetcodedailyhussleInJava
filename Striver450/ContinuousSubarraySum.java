import java.util.HashMap;
import java.util.HashSet;

public class ContinuousSubarraySum {

    public static boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int prefixSum=0;
        for(int i=0;i<nums.length;i++)
        {
            prefixSum=prefixSum+nums[i];
            int mod=prefixSum%k;
            if(map.containsKey(mod))
            {
                int current=i;
                int previous_index=map.get(mod);
                int length=current-previous_index;
                if(length>=2)
                {
                    return true;
                }

            }
            else {
                map.put(mod,i);

            }


        }

        return false;

    }


    public static void main(String[] args) {
        int [] nums = {23,2,6,4,7};
        int k = 6;
        System.out.println(checkSubarraySum(nums,k));
    }
}
