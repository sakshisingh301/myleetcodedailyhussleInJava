import java.util.*;

public class TopKElement {

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a1,a2)->a2[1]-a1[1]);

        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            int element=entry.getKey();
            int count=entry.getValue();
            pq.add(new int[]{element,count});

        }

        int index=0;
        int [] res=new int[k];



        while(index<k)
        {

           res[index]= pq.remove()[0];
            index++;
        }
        return res;



    }

    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(topKFrequent(nums,k));
    }
}
