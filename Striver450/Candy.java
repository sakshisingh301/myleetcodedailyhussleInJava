import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Candy {

    public static int candy(int[] ratings) {

        int [] temp=new int[ratings.length];
        for (int i=0;i<ratings.length;i++)
        {
            temp[i]=0;
        }

        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<ratings.length;i++)
        {
            map.put(ratings[i],i);
        }
        int left=0;
        int right=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            int key= entry.getKey();
            int val=entry.getValue();
            right=val+1;
            left=val-1;
            if(left>=0 && right<temp.length) {
                temp[val] = Math.max(temp[left], temp[right]) + 1;
                left=0;
                right=0;
            }
            else if(left<0)
            {
                temp[val]=temp[right]+1;
                left=0;
                right=0;
            }
            else if(right>temp.length-1)
            {
                temp[val]=temp[left]+1;
                left=0;
                right=0;
            }




        }
        int result=0;
        for(int i=0;i<temp.length;i++)
        {
            result=result+temp[i];
        }
        return result;

    }


    public static void main(String[] args) {
        int [] ratings ={1,2,2};
        System.out.println(candy(ratings));

    }
}
