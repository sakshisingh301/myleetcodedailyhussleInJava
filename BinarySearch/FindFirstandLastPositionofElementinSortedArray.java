public class FindFirstandLastPositionofElementinSortedArray {

    public static int[] searchRange(int[] nums, int target) {

        int leftMost=-1;
        int rightMost=-1;
        int start=0;
        int end=nums.length-1;

        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]<target)
            {
                start=mid+1;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else if(nums[mid]==target)
            {
                leftMost=mid;
                end=mid-1;
            }
        }

        start=0;
        end=nums.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]<target)
            {
                start=mid+1;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else if(nums[mid]==target)
            {
                rightMost=mid;
                start=mid+1;
            }

        }
        return new int[]{leftMost,rightMost};

    }

    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
    }
}
