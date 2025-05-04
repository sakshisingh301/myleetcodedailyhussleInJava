import java.util.HashMap;
import java.util.Map;

public class NumberOfEquivalentDominoPairs {



    public static int numEquivDominoPairs(int[][] dominoes) {

        int pair=0;
        int pair_internal=0;

        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<dominoes.length;i++)
        {
            int a=dominoes[i][0];
            int b=dominoes[i][1];
            int key = a<b?b*10+a:a*10+b;
            if(!map.containsKey(key))
            {
                map.put(key,1);
            }
            else {
                map.put(key, map.get(key)+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int val=entry.getValue();
            pair_internal=val*(val-1)/2;
            pair=pair+pair_internal;


        }
        return pair;

    }

    public static void main(String[] args) {
       int [] [] dominoes = {{1,2},{2,1},{3,4},{5,6}};
       System.out.println(numEquivDominoPairs(dominoes));
    }
}
