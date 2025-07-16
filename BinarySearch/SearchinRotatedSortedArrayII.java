public class SearchinRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {


        int start=0;
        int end=nums.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                return true;
            }
            else if (nums[start] == nums[end]) {
                start++;
                end--;
            } else if (nums[start] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;


    }

    public static void main(String[] args) {
      int []  nums = {1,0,1,1,1};
      int target = 0;
    }
}
