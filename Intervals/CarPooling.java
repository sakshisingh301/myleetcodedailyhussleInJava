import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CarPooling {

    public static boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, (i1, i2) -> Integer.compare(i1[1], i2[1]));
        PriorityQueue<int [] > min_heap=new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        int currentPassenger=0;
        for(int i=0;i<trips.length;i++)
        {
            int passengers=trips[i][0];
            int start=trips[i][1];
            int end=trips[i][2];

            while (!min_heap.isEmpty() && min_heap.peek()[1]<=start)
            {
                currentPassenger=currentPassenger-min_heap.peek()[0];
                min_heap.poll();

            }
            currentPassenger=currentPassenger+passengers;
            if(currentPassenger>capacity) return false;
            min_heap.add(new int[]{passengers,end});
        }
        return true;

    }

    public static void main(String[] args) {
        int [] [] trip={{2,1,5},{3,3,7}};
        int capacity=28;
        System.out.println(carPooling(trip,capacity));
        //{{2,1,5},{3,3,7},{2,6,9}};

    }
}
