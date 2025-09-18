public class SortAnArray {

    public int[] sortArray(int[] nums)
    {

       recursiveSort(nums, nums.length-1);
       return nums;



    }

    private void recursiveSort(int[] nums, int n) {

        if(n<=1)
        {
            return;
        }
        recursiveSort(nums,n-1);
        int temp=nums[nums.length-1];
        insert(nums,n-1,temp);


    }
    private void insert(int[] nums, int size,int elementToBeInserted)
    {
       if(size==0 ||nums[size]<=elementToBeInserted)
       {
           nums[size]=elementToBeInserted;
           return;
       }
       nums[size]=nums[size-1];

       insert(nums,size-1,elementToBeInserted);
    }

    public static void main(String[] args) {
        int [] nums= {5,2,3,1};
    }
}
