import java.util.Stack;

public class NextGreaterElement2 {

    public static int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack=new Stack<>();
        int [] temp =new int[nums.length];
        for(int i=nums.length-1;i>=0;i--)
        {
            stack.push(nums[i]);
        }

        for(int i=nums.length-1;i>=0;i--)
        {
            int curr=nums[i];
            if(!stack.isEmpty())
            {
                while (!stack.isEmpty() &&stack.peek()<=curr)
                {
                    stack.pop();
                }
                if(!stack.isEmpty())
                {
                    temp[i]=stack.peek();
                }
                else {
                    temp[i]=-1;
                }

            }
            stack.push(curr);
        }

     return temp;


    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,3};
        System.out.println(nextGreaterElements(nums));

    }
}
