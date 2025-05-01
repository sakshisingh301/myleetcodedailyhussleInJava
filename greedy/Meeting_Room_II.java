import java.util.Arrays;

public class Meeting_Room_II {

    public static int minMeetingRooms(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int room_required=1;
        for(int i=1;i<intervals.length;i++)
        {
            int curr_start=intervals[i][0];
            int curr_end=intervals[i][1];
            int pre_start=intervals[i-1][0];
            int pre_end=intervals[i-1][1];
            if(pre_end>curr_start)
            {
                room_required++;
            }

        }
        return room_required;



    }

    public static void main(String[] args) {
        int [] [] intervals ={{9,10},{4,9},{4,17}};
        System.out.println(minMeetingRooms(intervals));


    }
}
