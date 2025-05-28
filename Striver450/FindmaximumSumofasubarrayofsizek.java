public class FindmaximumSumofasubarrayofsizek {

    public static int max_sum_of_subarray(int[] nums, int k ) {

        int i=0;
        int j=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(j<nums.length)
        {
             sum=sum+nums[j];
             if(j-i+1!=k)
             {
                 j++;
             }
             else {
                 max=Math.max(max,sum);
                 sum=sum-nums[i];
                 j++;
                 i++;

             }
        }
        return max;

    }

    public static void main(String[] args) {
        int [] arr = {100, 200, 300, 400};
        int k=2;
        System.out.println(max_sum_of_subarray(arr,k));
    }
}
