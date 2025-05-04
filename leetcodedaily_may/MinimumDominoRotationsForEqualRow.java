import java.util.HashMap;
import java.util.Map;

public class MinimumDominoRotationsForEqualRow {


    public static int minDominoRotations(int[] tops, int[] bottoms) {

//        int [] tops_count=new int[7];
//        int [] bottoms_count=new int[7];
//        int [] common=new int [7];
//        int res=tops.length;
//
//        for(int i=0;i<tops.length;i++)
//        {
//            int a=tops[i];
//            int b=bottoms[i];
//            if(a==b)
//                common[a]=common[a]+1;
//            tops_count[a]=tops_count[a]+1;
//            bottoms_count[b]=bottoms_count[b]+1;
//
//        }
//
//        for(int i=1;i<tops_count.length;i++)
//        {
//            if(tops_count[i]+bottoms_count[i]-common[i]==tops.length)
//            {
//
//            }
//        }
        return 0;

    }

    public static void main(String[] args) {
      int []  tops = {2,1,2,4,2,2};
      int [] bottoms = {5,2,6,2,3,2};
      System.out.println(minDominoRotations(tops,bottoms));

    }
}
