import java.util.HashMap;
import java.util.List;

public class MinimumIndexofaValidSplit {

    public int minimumIndex(List<Integer> nums) {

        int dominant=-1;
        int majority=-1;
        int c1=0;

        for(int i=0;i<nums.size();i++)
        {
            if(c1==0)
            {
                dominant=nums.get(i);
                c1++;
            }
            else if(nums.get(i)==dominant)
            {
                c1++;
            }
            else {
                c1--;
            }

        }
        int target=nums.size()/2;
        c1=0;

        for(int i=0;i<nums.size();i++)
        {
            if(nums.get(i)==dominant)
            {
                c1++;
            }

        }
        if(c1>target)
        {
            majority=dominant;
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.size();i++)
        {
            if(!map.containsKey(nums.get(i)))
            {
                map.put(nums.get(i),1);
            }
            else {
                map.put(nums.get(i),map.get(nums.get(i))+1 );
            }
        }
        c1=0;

        for(int i=0;i<nums.size();i++)
        {
            Integer curr=nums.get(i);
            if(curr==majority)
            {
                c1++;
                int leftTarget=(i+1)/2;
                int rightTarget=(nums.size()-i-1)/2;
                if(c1>leftTarget && map.get(majority)-c1>rightTarget)
                {
                    return i;

                }

            }
        }
        return -1;

    }


    public static void main(String[] args) {


    }
}
