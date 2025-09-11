import java.util.Stack;

public class CountBowlSubarrays {

    public static long bowlSubarrays(int[] nums) {

        //Find Next greatest element to the left
        //Find next greatest element to the right

        long countBowl=0;
        Stack<Integer> stack=new Stack<>();
        int [] nge_r=new int[nums.length];

        for(int i=nums.length-1;i>=0;i--)
        {
            int curr=nums[i];
            if(stack.isEmpty())
            {
                nge_r[i]=-1;
            }
            else
            {
                while(!stack.isEmpty() && curr>=stack.peek())
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    nge_r[i]=-1;
                }
                else {
                    nge_r[i] = stack.peek();
                }
            }
            stack.push(curr);

        }
        stack.clear();


        int [] nge_l=new int[nums.length];

        for(int i=0;i< nums.length;i++)
        {
            int curr=nums[i];
            if(stack.isEmpty())
            {
                nge_l[i]=-1;
            }
            else{
                while(!stack.isEmpty() && curr>=stack.peek())
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    nge_l[i]=-1;
                }
                else {
                    nge_l[i]=stack.peek();
                }
            }
            stack.push(curr);
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nge_r[i]!=-1 && nge_l[i]!=-1)
            {
                countBowl++;
            }
        }

        return countBowl;

    }


    public static void main(String[] args) {
        int [] nums={5,1,2,3,4};
        System.out.println(bowlSubarrays(nums));

    }
}
