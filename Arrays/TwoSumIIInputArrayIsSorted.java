package ArraysQuestion;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {

    public static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;

        while(start<end)
        {
            int sum=numbers[start]+numbers[end];
            if(sum>target)
            {
                sum=sum-numbers[end];
                end--;
            }
            else if(sum<target)
            {
                sum=sum-numbers[start];
                start++;
            }
            else {
                return new int[]{start+1,end+1};
            }
        }
        return new int[]{0,0};


    }

    public static void main(String[] args) {
       int [] numbers = {2,7,11,15};
       int target = 9;
       System.out.println(Arrays.toString(twoSum(numbers, target)));

    }
}
