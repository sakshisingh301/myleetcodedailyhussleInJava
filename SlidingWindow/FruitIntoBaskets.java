import java.util.HashMap;

public class FruitIntoBaskets {

    public static int totalFruit(int[] fruits) {

        int no_of_baskets=2;
        HashMap<Integer,Integer> map=new HashMap<>();

        int start=0;
        int end=0;
        int total_fruit=0;

        while(end<fruits.length)
        {
            map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);
            int map_size= map.size();

            if(map_size<=no_of_baskets)
            {
                total_fruit=Math.max(total_fruit,end-start+1);

            }
            else {
                while(map_size>no_of_baskets)
                {
                    map.put(fruits[start],map.get(fruits[start])-1);
                    if(map.get(fruits[start])==0)
                    {
                        map.remove(fruits[start]);
                    }
                    map_size=map.size();
                    start++;
                }
            }
            end++;

        }
        return total_fruit;

    }


    public static void main(String[] args) {

        int [] fruits={3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(totalFruit(fruits));

    }
}
