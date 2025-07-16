public class FindMinimuminRotatedSortedArray {

    public static int findMin(int[] nums) {
        if(nums.length==1)
            return nums[0];


        int start=0;
        int end=nums.length-1;
        int peak =-1;

        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if( (mid==0 && nums[mid]>nums[mid+1])||
                    (mid!=0 && mid!= nums.length-1 && nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])||
                    (mid== nums.length-1 && nums[mid]>nums[mid-1])
            )
            {
                peak=mid;
                break;

            }
            else if(nums[0]>nums[mid])
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }

        }


        if(peak!=0 && peak!= nums.length-1)
        {
            return nums[peak+1];
        }
        else if(peak== nums.length-1){
            return nums[0];
        }
        else if(peak==0 )
        {
            if(nums[nums.length-1]<nums[peak+1])
            {
                return nums[nums.length-1];
            }
            else if(nums[nums.length-1]>nums[peak+1])
            {
                return nums[peak+1];

            }
            else if(nums.length==2)
            {
                return nums[peak+1];
            }

        }
        return -1;




    }

    public static void main(String[] args) {
       int [] nums = {2,1};
       System.out.println(findMin(nums));
    }
}
