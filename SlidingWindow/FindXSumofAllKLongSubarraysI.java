import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindXSumofAllKLongSubarraysI {

    public static int[] findXSum(int[] nums, int k, int x) {

        HashMap<Integer,Integer> map=new HashMap<>();
        int [] result=new int[nums.length-k+1];
        int start=0;
        int end=0;
        int i=0;

        while(end<nums.length)
        {
            map.put(nums[end], map.getOrDefault(nums[end],0)+1);
            if(end>=k)
            {
                map.put(nums[start], map.get(nums[start])-1);
                start++;
            }
            if(end>=k-1)
            {
                List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
                //this part is copied from chatgpt
                //difficulty writing lambda function
                list.sort((a, b) -> {
                    if (!a.getValue().equals(b.getValue())) {
                        return b.getValue() - a.getValue(); // higher freq first
                    }
                    return b.getKey() - a.getKey(); // tie → bigger value first
                });
                int sum=0;
                int count=0;
                for(Map.Entry<Integer, Integer> entry : list)
                {
                    if(count==x)
                    {
                        break;

                    }
                    sum=sum+ entry.getKey()* entry.getValue();
                    count++;
                }
                result[i]=sum;
                i++;


            }
            end++;

        }
        return result;

    }

    public static void main(String[] args) {
        int [] nums = {1,1,2,2,3,4,2,3};
        int k = 6, x = 2;
        System.out.println(findXSum(nums,k,x));

    }
}
