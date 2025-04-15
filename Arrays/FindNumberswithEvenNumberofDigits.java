
package ArraysQuestion;
public class FindNumberswithEvenNumberofDigits {

    public static boolean isEven(int digit)
    {
        int count=0;
        while(digit!=0)
        {
            digit=digit/10;
            count++;
        }
        return count%2==0;
    }

    public static int findNumbers(int[] nums) {
        int countEven=0;

        for(int i=0;i<nums.length;i++)
        {
         int digit=nums[i];
         if(isEven(digit))
             countEven++;

        }
        return countEven;
    }

    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }

}
