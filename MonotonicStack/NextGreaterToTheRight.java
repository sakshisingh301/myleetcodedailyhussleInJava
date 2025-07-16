import java.util.Stack;

public class NextGreaterToTheRight {

    public static int [] nextGraterElementToTheRight(int [] nums)
    {
        int [] res=new int [nums.length];
        int k=nums.length-1;
        Stack<Integer> stack=new Stack<>();

        for(int i=nums.length-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                res[k]=-1;
            }
            else {
                while(!stack.isEmpty() && stack.peek()<=nums[i])
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    res[k]=-1;
                }
                else {
                    res[k]=stack.peek();
                }

            }
            stack.push(nums[i]);
            k--;

        }
        return res;

    }


    public static void main(String[] args) {
        int [] nums={1,2,2,3,1,0};
        System.out.println(nextGraterElementToTheRight(nums));
        //{2,3,3,-1,-1,-1};
    }
}
