public class Numbers_with_even_digits {

    public static int findNumbers(int[] nums) {

        int final_count=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];
            while(temp!=0)
            {
                temp=temp/10;
                count++;

            }

            if(count%2==0)
            {
                final_count++;

            }
            count=0;
        }
        return final_count;

    }

    public static void main(String[] args) {
        int [] nums={437,315,322,431,686,264,442};
        System.out.println(findNumbers(nums));
    }
}
