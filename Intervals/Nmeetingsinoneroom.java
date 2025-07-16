import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nmeetingsinoneroom {

    static class  Meeting
    {
        int start;
        int end;
        Meeting(int start,int end)
        {
            this.start=start;
            this.end=end;
        }
    }

    public static int maxMeetings(int[] start, int[] end) {

        List<Meeting> meetings=new ArrayList<>();
        int maxMeeting=1;
        for(int i=0;i< start.length;i++)
        {
            meetings.add(new Meeting(start[i],end[i]));
        }
        meetings.sort((a, b) -> Integer.compare(a.end, b.end));
        int intEnd=meetings.get(0).end;
        int index=1;

        for(int i=index;i<start.length;i++)
        {
            Meeting meeting=meetings.get(i);
            int currMeetingStart=meeting.start;
            int currMeetingEnd=meeting.end;
            if(intEnd<currMeetingStart)
            {
                maxMeeting++;
                intEnd=currMeetingEnd;
            }


        }
        return maxMeeting;

    }

    public static void main(String[] args) {
      int []  Start = {1, 3, 0, 5, 8, 5};
      int [] End = {2, 4, 6, 7, 9, 9};

      System.out.println(maxMeetings(Start,End));
    }
}
