import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Group_Shifted_Strings {

   public static String getHashKey(String string)
   {


       StringBuilder hashkey =new StringBuilder();
       for(int i=1;i<string.length();i++)
       {
           hashkey.append((string.charAt(i)-string.charAt(i-1)+26)%26);
       }
       return hashkey.toString();
   }

    public static List<List<String>> groupStrings(String[] strings) {

        HashMap<String,List<String>> map=new HashMap<>();


        for(String str: strings)
        {

            String key=String.valueOf(str);
            String hashKey=getHashKey(key);

            if(!map.containsKey(hashKey))
            {
                ArrayList<String> temp=new ArrayList<>();
                temp.add(key);
             map.put(hashKey,temp);

            }
            else {
                map.get(hashKey).add(key);
            }
        }


        return new ArrayList<>(map.values());


    }

    public static void main(String[] args) {
       String[] strings = {"abn","aln"};
       System.out.println(groupStrings(strings));
    }
}
