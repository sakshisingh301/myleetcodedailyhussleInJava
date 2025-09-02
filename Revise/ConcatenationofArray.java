public class ConcatenationofArray {

    public static int[] getConcatenation(int[] nums) {

        int[] result=new int[2*nums.length];
        int k=0;
        int restart=0;
        int i=0;

        while(k<result.length)
        {

            if(restart==nums.length)
            {
                i=0;
            }
            result[k]=nums[i];
            i++;
            k++;
            restart++;
        }
        return result;

    }

    public static int[] getConcatenationBetter(int[] nums) {
        int n=nums.length;
        int [] result=new int[2*n];

        for(int i=0;i<result.length;i++)
        {
            result[i]=nums[i];
            result[i+n]=nums[i];
        }
        return result;

    }


    public static void main(String[] args) {
        int [] nums={1,2,3};
        System.out.println(getConcatenationBetter(nums));
    }

}
