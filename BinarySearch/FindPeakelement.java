public class FindPeakelement {

    public static int findPeakElement(int[] nums) {
        if(nums.length==1)
            return 0;

        int start=0;
        int end=nums.length-1;


        while (start<=end)
        {
            int mid=start+(end-start)/2;


            if( mid==nums.length-1 || mid!=0 && nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1] )
            {
                return mid;

            }
            else if(mid<nums.length-1 &&nums[mid]<nums[mid+1])
            {
                start=mid+1;
            }
            else if(nums[mid]>nums[mid+1]){
                end=mid-1;
            }
        }
        return start;


    }

    public static void main(String[] args) {
        int [] nums={2,1};
        //            0,1,2,3,4,5,6
        System.out.println(findPeakElement(nums));
    }
}
