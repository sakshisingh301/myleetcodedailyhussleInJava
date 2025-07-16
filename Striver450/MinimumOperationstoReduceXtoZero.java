import java.util.HashMap;

public class MinimumOperationstoReduceXtoZero {

    public static int minOperations(int[] nums, int x) {
        int [] prefixSum=new int[nums.length];
        int sum=0;

        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            prefixSum[i]=sum;
        }
        int total= sum;
        int k=total-x;
        if(total==x)
            return nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int current_window=0;
        int max=-1;
        for(int i=0;i<prefixSum.length;i++)
        {
//            int temp=prefixSum[i]-k;
            if(map.containsKey(prefixSum[i]-k))
            {

               int curr=i;
                int first_ocuurance=map.get(prefixSum[i]-k);
                max=Math.max(max,curr-first_ocuurance);
            }
                map.put(prefixSum[i],i);

        }
        if(max==-1)
            return -1;
        return nums.length-max ;







    }

    public static void main(String[] args) {
        int [] nums = {8828,9581,49,9818,9974,9869,9991,10000,10000,10000,9999,9993,9904,8819,1231,6309};
        int x = 134365;
        //k==6
        //[1.2,6,8,11]

        System.out.println(minOperations(nums,x));
    }
}
