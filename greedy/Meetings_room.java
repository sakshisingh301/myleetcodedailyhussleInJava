import java.util.Arrays;

public class Meetings_room {

    public static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        for(int i=1;i<intervals.length;i++)
        {
            int curr_start=intervals[i][0];
            int curr_end=intervals[i][1];
            int prev_end=intervals[i-1][1];
            if(curr_start<prev_end || curr_end<= prev_end)
            {
                return false;
            }
        }
        return true;



    }


    public static void main(String[] args) {
        int [][]  intervals = {{7,10},{2,4}};
        System.out.println(canAttendMeetings(intervals));
    }
}
