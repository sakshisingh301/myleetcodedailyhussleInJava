import java.util.ArrayList;
import java.util.Arrays;

public class InsertInterval {

    public static int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int []> result=new ArrayList<>();
        int startN=newInterval[0];
        int endN=newInterval[1];
        int index=0;
        int newStart=startN;
        int newEnd=endN;

        while(index< intervals.length && intervals[index][1]<startN)
        {
            result.add(new int []{intervals[index][0],intervals[index][1]});
            index++;
        }
        while (index<intervals.length && intervals[index][0]<=endN)
        {
            newStart=Math.min(intervals[index][0],newStart);
            newEnd=Math.max(intervals[index][1],newEnd);
            index++;
        }
        result.add(new int[]{newStart,newEnd});
        while(index<intervals.length)
        {
            result.add(new int[]{intervals[index][0],intervals[index][1]});
            index++;
        }
        return result.toArray(new int [0][0]);



    }

    public static int[][] insert1(int[][] intervals, int[] newInterval) {

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        int newIntervalStart=newInterval[0];
        int newIntervalEnd=newInterval[1];
        int newStart=newIntervalStart;
        int newEnd=newIntervalEnd;
        int index=0;
        ArrayList<int []> temp=new ArrayList<>();

        while(index<intervals.length)
        {
            int[] curr=intervals[index];
            int currStart=curr[0];
            int currEnd=curr[1];
            while(index<intervals.length &&newIntervalStart>currEnd)
            {
                temp.add(new int[]{currStart,currEnd});
                index++;
            }
            while ( index<intervals.length && newIntervalStart<=currStart)
            {
                newStart=Math.min(currStart,newStart);
                newEnd=Math.max(currEnd,newEnd);
                index++;

            }
            temp.add(new int[]{newStart,newEnd});
            while(index<intervals.length)
            {
                temp.add(new int[] {currStart,currEnd});
                index++;
            }



        }
        return temp.toArray(new int [0][0]);

    }



    public static void main(String[] args) {
      int [][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
      int [] newInterval = {4,8};
     System.out.println(Arrays.deepToString(insert1(intervals, newInterval)));
    }
}
