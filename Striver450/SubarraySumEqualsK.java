import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {


        HashMap<Integer,Integer> map =new HashMap<>();
        map.put(0,1);
        int prefixSum=0;
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            prefixSum=prefixSum+nums[i];
            if(map.containsKey(prefixSum-k))
            {
                count=count+map.get(prefixSum-k);

            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;




    }

    public static void main(String[] args) {
        int [] nums = {1,-1,0};
        int  k = 0;
        System.out.println(subarraySum(nums,k));
    }
}
