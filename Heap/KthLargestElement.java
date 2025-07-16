import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> max_heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            max_heap.add(nums[i]);
        }

        while(k!=1)
        {
            max_heap.poll();
            k--;
        }
        return max_heap.peek();

    }

    public static void main(String[] args) {
        int [] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums,k));
    }
}
