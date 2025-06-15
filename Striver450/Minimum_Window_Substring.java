import java.util.HashMap;
import java.util.Map;

public class Minimum_Window_Substring {

    public static String minWindow(String s, String t) {

        HashMap<Character, Integer> mapForT=new HashMap<>();
        String result="";
        for(int i=0;i<t.length();i++)
        {
            mapForT.put(t.charAt(i),mapForT.getOrDefault(t.charAt(i),0)+1);
        }
        HashMap<Character,Integer> mapForS=new HashMap<>();

        int left=0;
        int right=0;
        int required=mapForT.size();
        int formed=0;
        int min=Integer.MAX_VALUE;
        while(right<s.length())
        {
            char curr=s.charAt(right);
            mapForS.put(curr,mapForS.getOrDefault(curr,0)+1);
            if( mapForT.containsKey(curr) && mapForT.get(curr).equals(mapForS.get(curr)))
            {
                formed++;
            }
            while(left<=right && formed==required)
            {
                if(right-left+1<min)
                {
                    min=right-left+1;
                    result=s.substring(left,right+1);


                }

                char left_p=s.charAt(left);

                mapForS.put(left_p,mapForS.get(left_p)-1);

                if(mapForT.containsKey(left_p) && mapForT.get(left_p)>mapForS.get(left_p))
                {
                    formed--;

                }

                left++;

            }

            right++;

        }
        return result;

    }



    public static void main(String[] args) {
     String s = "A";
     String t = "A";
     System.out.println(minWindow(s,t));
    }
}
