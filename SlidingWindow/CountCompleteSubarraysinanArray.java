import java.util.Arrays;
import java.util.HashSet;

public class CountCompleteSubarraysinanArray {

    public int countCompleteSubarrays(int[] nums) {

        HashSet<Integer> set=new HashSet<>();
        int distinct = new HashSet<>(
                Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new))
        ).size();
//        Arrays.stream(nums).forEach(set::add);
//        int unique=set.size();
//        int uniqueElement=new HashSet<>(Arrays.stream(nums).forEach();).size();


        return 0;

    }
   //n*n
    public static int countCompleteSubarraysBruteForce(int [] nums)
    {
        int unique=new HashSet<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new))).size();
        int countComplete=0;
        for(int i=0;i< nums.length;i++)
        {
            HashSet<Integer> set =new HashSet<>();
            for(int j=i;j<nums.length;j++)
            {
                set.add(nums[j]);
                if(set.size()==unique)
                {
                    countComplete++;
                }
            }
        }
        return countComplete;

    }

    public static void main(String[] args) {

        int [] nums={1,3,1,2,2};
        System.out.println(countCompleteSubarraysBruteForce(nums));

    }
}
