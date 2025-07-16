import java.util.*;

public class TimeBasedKeyValueStore {

    class Pair{

        int timeStamp;
        String value;

        public Pair(int timeStamp,String value) {
            this.timeStamp=timeStamp;
            this.value=value;

        }
    }

    Map<String, List<Pair>>timeBasedStoredValue;

    public TimeBasedKeyValueStore() {
        timeBasedStoredValue=new HashMap<>();

    }

    public void set(String key, String value, int timestamp) {
        timeBasedStoredValue.computeIfAbsent(key,k->new ArrayList<>()).add(new Pair(timestamp,value));


    }

    public String get(String key, int timestamp) {
        String result="";
        if(!timeBasedStoredValue.containsKey(key)) return "";
        List<Pair> values=timeBasedStoredValue.get(key);

        int start=0;
        int end= values.size();
        while(start<=end)
        {
            int mid=start+(end-start)/2;


            if(values.get(mid).timeStamp<=timestamp)
            {
                result= values.get(mid).value;
                start=mid+1;
            }
            else {
                end=mid-1;
            }

        }
        return result;

    }
}
