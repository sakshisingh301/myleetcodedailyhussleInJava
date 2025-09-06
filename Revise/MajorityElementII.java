import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {

    public static List<Integer> majorityElement(int[] nums) {
        Integer candidate1=null;
        Integer candidate2=null;
        int c1=0;
        int c2=0;

        for(int i=0;i< nums.length;i++)
        {
            if(candidate1!=null && candidate1==nums[i])
            {
                c1++;
            }
            else if(candidate2!=null && candidate2==nums[i])
            {
                c2++;
            }
           else if(c1==0)
           {
               candidate1=nums[i];
               c1++;
           }
           else if(c2==0)
           {
               candidate2=nums[i];
               c2++;
           }
           else {
               c1--;
               c2--;
           }
        }
        List<Integer> res=new ArrayList<>();
        c1=0;
        c2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==candidate1)
            {
                c1++;
            }
            else if(nums[i]==candidate2)
            {
                c2++;
            }
        }

        int target=nums.length/3;
        if(c1>target)
        {
            res.add(candidate1);
        }
        if(c2>target)
        {
            res.add(candidate2);
        }
        return res;

    }

    public static void main(String[] args) {
        int [] nums = {1,1,2,3,4,1,1,5,6,7,1,1,8,9,10,1,11,12,13,14};
        System.out.println(majorityElement(nums));

    }
}
