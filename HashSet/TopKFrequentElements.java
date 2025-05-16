import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>> sortedList=new ArrayList<>(map.entrySet());
        sortedList.sort((a, b) -> b.getValue() - a.getValue());
        int y=0;
        for(Map.Entry<Integer, Integer> x: sortedList)
        {
            if(y<k)
            {
               res.add(x.getKey());
               y++;
            }


        }

        int[] resultArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resultArray[i] = res.get(i);
        }

        return resultArray;




    }


    public static void main(String[] args) {
        int [] nums={1,1,1,2,2,3};
        int k=2;
        System.out.println(topKFrequent(nums,k));

    }
}
