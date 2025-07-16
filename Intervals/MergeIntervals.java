import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        int index=1;
        int start=intervals[0][0];
        int end=intervals[0][1];
        ArrayList<int []> res=new ArrayList<>();
        while(index< intervals.length && intervals[index][0]>end )
        {
            res.add(new int[]{intervals[index][0], intervals[index][1]});
            start=intervals[index][0];
            end=intervals[index][1];
            index++;
        }

        while(index<intervals.length && intervals[index][0]<=end )
        {
            start=Math.min(intervals[index][0],start);
            end=Math.max(intervals[index][1],end);
            index++;
        }
        res.add(new int []{start,end});
        start=intervals[index][0];
        end=intervals[index][1];


        while (index< intervals.length)
        {
            res.add(new int[]{intervals[index][0],intervals[index][1]});
            index++;
        }
        return res.toArray(new int [0][0]);
    }

    public static int[][] merge1(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];
        ArrayList<int[]> res = new ArrayList<>();
        int index = 1;

        while (index < intervals.length) {
            if (intervals[index][0] <= end) {
                end = Math.max(end, intervals[index][1]);
            } else {
                res.add(new int[]{start, end});
                start = intervals[index][0];
                end = intervals[index][1];
            }
            index++;
        }
        res.add(new int[]{start, end});
        return res.toArray(new int [0][0]);


    }



    public static void main(String[] args) {
      int [] [] intervals = {{2,3},{2,2},{3,3},{1,3},{5,7},{2,2},{4,6}};
      //((1,3)(2,2),(2,2),(2,3),(3,3),(4,6),(5,7))

      System.out.println(merge1(intervals));
    }
}
