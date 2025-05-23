public class Check_if_an_Array_is_Sorted {

    public static boolean isSorted(int [] nums)
    {
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr = {20, 20, 78, 98, 99, 97};
        System.out.println(isSorted(arr));
    }
}
