import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MinimumIndexSumofTwoLists {
    public  static String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String, Integer> map=new HashMap<>();
        ArrayList<String> res=new ArrayList<>();

        int minSum=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++)
        {
            map.put(list1[i],i);
        }

        for(int i=0;i<list2.length;i++)
        {
            String curr=list2[i];
            if(map.containsKey(curr))
            {
                int currSum=map.get(curr)+i;
                if(currSum<minSum)
                {
                    minSum=currSum;
                    res.clear();
                    res.add(curr);
                    map.put(curr,currSum);
                }
                else if(currSum==minSum)
                {
                    res.add(curr);
                }
            }

        }
        return res.toArray(new String[0]);



    }

    public static void main(String[] args) {
      String[]  list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
      String[] list2 = {"KFC","Shogun","Burger King"};
      System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }
}
