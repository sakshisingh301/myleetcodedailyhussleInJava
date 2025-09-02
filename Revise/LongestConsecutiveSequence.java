import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        int longestConsecutive=0;
        int starting=1;

        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i< nums.length;i++)
        {
            hashSet.add(nums[i]);
        }

        for(int num:hashSet)
        {
            int curr=num;
            if(!hashSet.contains(curr-1))
            {
             while(hashSet.contains(curr+1))
             {
                 starting++;
                 curr=curr+1;
             }
             longestConsecutive=Math.max(starting,longestConsecutive);
             starting=1;

            }

        }
        return longestConsecutive;

    }


    public static void main(String[] args) {

        int [] nums={9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(nums));

    }
}
