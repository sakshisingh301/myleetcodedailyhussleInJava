public class Range_Sum_Query_Immutable {
    int [] temp;


    public Range_Sum_Query_Immutable(int[] nums) {
        temp=new int[nums.length];
        for(int i=0;i<temp.length;i++)
        {
            temp[i]=nums[i];
        }

    }

    public int sumRange(int left, int right) {
        int sum=0;
        for(int i=left;i<=right;i++)
        {
            sum=sum+temp[i];
        }
        return sum;

    }
}
