import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> resList=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=nums2.length-1;i>=0;i--)
        {
            int curr=nums2[i];

            if(!stack.isEmpty() ) {

                    while(!stack.isEmpty() && stack.peek()<curr)
                    {
                        stack.pop();
                    }
                    if(!stack.isEmpty()) {
                        map.put(curr, stack.peek());
                    }
                    else {
                        map.put(curr,-1);
                    }

            }
            else if(stack.isEmpty())
            {
                map.put(curr,-1);
            }

            stack.push(curr);

        }

        for(int i=0;i<nums1.length;i++)
        {
            int curr=nums1[i];

            resList.add(map.get(curr));
        }
        int [] res=new int[resList.size()];
        for(int i=0;i<res.length;i++)
        {
            res[i]= resList.get(i);
        }


        return res;



    }

    public static void main(String[] args) {
        int [] nums1 = {4,1,2};
        int [] nums2 = {1,3,4,2};
        System.out.println(nextGreaterElement(nums1,nums2));


    }
}
