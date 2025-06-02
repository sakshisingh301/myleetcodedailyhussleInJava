public class FindtheDuplicateNumber {

    public int findDuplicate(int[] nums) {

      int slow=0;//0
      int fast=nums[slow];//1

      while(slow!=fast)
      {
          slow=nums[slow];
          fast=nums[nums[fast]];
      }

      slow=0;
      while(slow!=fast)
      {
          slow=nums[slow];
          fast=nums[fast];

      }
      return slow;


    }

    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
    }
}
