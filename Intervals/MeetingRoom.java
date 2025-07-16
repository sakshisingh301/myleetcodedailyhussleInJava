import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MeetingRoom {

    public class Interval {
     public int start, end;
      public Interval(int start, int end) {
          this.start = start;
         this.end = end;
     }
 }

    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.isEmpty())
            return true;


        intervals.sort(Comparator.comparingInt(a -> a.start));

       Interval list = intervals.get(0);
       int prevStart=list.start;
       int prevEnd=list.end;

       for(int i=1;i< intervals.size();i++)
       {

           Interval currList=intervals.get(i);
           int currStart=currList.start;
           int currEnd=currList.end;
           if(prevEnd>currStart)
           {
               return false;
           }
           else {
               prevEnd=currEnd;
           }

       }
       return true;



    }

    public static void main(String[] args) {
        //[(0,30),(5,10),(15,20)]

    }
}
