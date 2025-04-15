package ArraysQuestion;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxZeros=0;
        int count=0;
        for(int i=0;i< nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else {
                count=0;
            }
            maxZeros=Math.max(maxZeros,count);

        }
        return maxZeros;


    }

    public static void main(String[] args) {
        int []  nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }


}
