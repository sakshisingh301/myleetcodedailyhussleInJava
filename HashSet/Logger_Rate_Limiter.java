import java.util.HashMap;

public class Logger_Rate_Limiter {

    HashMap<String, Integer> set;

    public Logger_Rate_Limiter() {
        set=new HashMap<>();


    }

    public boolean shouldPrintMessage(int timestamp, String message) {


        if(!set.containsKey(message))
        {
            set.put(message,timestamp+10);
        }
        else {

             if(set.get(message)>timestamp)
            {

                return false;
            }
            else {
                 set.put(message,timestamp+10);
                return true;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        //[[],[0,"A"],[0,"B"],[0,"C"],[0,"A"],[0,"B"],[0,"C"],[11,"A"],[11,"B"],[11,"C"],[11,"A"]]
    }


}
