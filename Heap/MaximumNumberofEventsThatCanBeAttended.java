import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumNumberofEventsThatCanBeAttended {

    public static int maxEvents(int[][] events) {
        int n=events.length;
        int noOfEvent=0;
        int count=0;
       PriorityQueue<Integer> min_heap=new PriorityQueue<>();
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));
        int i=0;
        int day=0;

        while(!min_heap.isEmpty() ||i<n)
        {
            if(i<n && min_heap.isEmpty() )
            {
                day=events[i][0];
            }

            while (i<n && events[i][0]==day)
            {
                min_heap.add(events[i][1]);
                i++;
            }

            while(i<n && !min_heap.isEmpty() && count==0 )
            {
                noOfEvent++;
                count++;
                min_heap.poll();


            }
            count=0;
            day++;



        }
        return noOfEvent;




    }


    public static void main(String[] args) {
        int [] [] events = {{1,4},{4,4},{2,2},{3,4},{1,1}};

        System.out.println(maxEvents(events));



    }
}
