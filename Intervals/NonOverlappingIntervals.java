import java.util.Arrays;

public class NonOverlappingIntervals {

    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[1], i2[1]));
        int prevStart=intervals[0][0];
        int prevEnd=intervals[0][1];
        int eraseCount=0;

        for (int i=1;i<intervals.length;i++)
        {
            int [] curr=intervals[i];
            if(prevEnd>curr[0])
            {
               eraseCount++;
               prevEnd=Math.min(prevEnd,curr[1]);
            }
            else {
                prevEnd=curr[1];
            }

        }
        return eraseCount;





    }

    public static void main(String[] args) {

       int [] [] intervals = {{0,2},{1,3},{2,4},{3,5},{4,6}};
       //(1,2) (1,3) (2,3) (3,4)
        System.out.println(eraseOverlapIntervals(intervals));

    }
}
