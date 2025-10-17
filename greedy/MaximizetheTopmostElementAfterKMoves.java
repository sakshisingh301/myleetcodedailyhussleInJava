import java.util.Arrays;

public class MaximizetheTopmostElementAfterKMoves {

    public static int maximumTop(int[] nums, int k) {

            int size=nums.length;
            if (size == 1 && (k % 2 == 1)) {
                return -1;
            }

            if(k==1)
            {
                if(size==1)
                {
                    return -1;
                }
                else {
                    return nums[1];
                }
            }

            if (k > size) {
                return Arrays.stream(nums).max().getAsInt();
            }

            if (k == size) {
                return Arrays.stream(nums, 0, size - 1).max().getAsInt();
            }

            if(size>k)
            {
                int max=Integer.MIN_VALUE;
                int i=0;
                while(i<k-1)
                {
                    max=Math.max(nums[i],max);
                    i++;
                }
                return Math.max(max,nums[k]);
            }
            return -1;

        }





    public static void main(String[] args) {
        // nums = [5,2,2,4,0,6], k = 4
        //[4,2,1] k=4
        //[4,2,1] k=3- done
        // nums = [5], k = 1-done
        // nums = [5,2], k = 1-done
    }
}
