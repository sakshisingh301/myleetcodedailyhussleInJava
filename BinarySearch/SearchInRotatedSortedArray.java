public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        if(nums.length==1 ) {
            if(nums[0]==target) {
                return 0;
            }
            else {
                return -1;
            }
        }



    int start=0;
    int end=nums.length-1;
    int peak=-1;

    while(start<=end)
    {
        int mid=start+(end-start)/2;
        if((mid==nums.length-1 && nums[mid]>nums[mid-1] )
                || mid!=0 &&nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1] &&mid!=nums.length-1
                ||(mid==0 &&nums[mid]>nums[mid+1]))
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

    start=0;
    end=nums.length-1;

    if(nums[0]>target)
    {
        start=peak+1;
    }
    else {
        end=peak;
    }
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }

        }
        return -1;



    }

    public static void main(String[] args) {
       int [] nums = {1,0,1,1,1};
       int target = 0;
       System.out.println(search(nums,target));

    }
}
