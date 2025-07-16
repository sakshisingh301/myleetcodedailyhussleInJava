import java.util.HashMap;
import java.util.HashSet;

public class Contiguous_Array {

    public static int findMaxLength(int[] nums) {

        for(int i=0;i< nums.length;i++)
        {
            if(nums[i]==0)
            {
                nums[i]=-1;
            }
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int prefix_sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {

            prefix_sum=prefix_sum+nums[i];
           if(map.containsKey(prefix_sum))
           {
               int curr=i;
               int first_ocuurance=map.get(prefix_sum);
               max=Math.max(max,curr-first_ocuurance);

           }
           else {
               map.put(prefix_sum,i);
           }
        }
        return max;


    }


    public static void main(String[] args) {
        int [] nums={0,1};
        //{-1,1,1,1,1,1,-1,-1,-1}
        //hashmap - (0,-1)
        //(-1,0)
        //(0,1)
        //(1,2)
        //(2,3)
        //(3,4)
        //(4,5)
        //(3,6)
        //(2,7)
        //(1,8)
        System.out.print(findMaxLength(nums));

    }
}
