import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoom2 {

    public static int minMeetingRooms(int[][] intervals) {
        int minimumDay=1;
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        PriorityQueue<int [] > min_heap=new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        int [] startInterval=intervals[0];
        int preEnd=startInterval[1];
        min_heap.add(new int[]{startInterval[0],startInterval[1]});
        for(int i=1;i< intervals.length;i++)
        {
            int [] curr=intervals[i];
            int currStart=curr[0];
            int currEnd=curr[1];
            if(preEnd>currStart)
            {
                minimumDay++;
                min_heap.add(new int[]{currStart,currEnd});

            }
            else {
                min_heap.poll();
                min_heap.add(new int[]{currStart,currEnd});

            }
            if(!min_heap.isEmpty()) {
                preEnd = min_heap.peek()[1];
            }
        }
        return minimumDay;

    }

    public static void main(String[] args) {
       int [][] intervals = {{1,5},{8,9},{8,9}};
       System.out.println(minMeetingRooms(intervals));

    }
}
