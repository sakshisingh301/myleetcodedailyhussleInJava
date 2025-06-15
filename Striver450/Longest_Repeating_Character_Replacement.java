import java.util.HashMap;

public class Longest_Repeating_Character_Replacement {


    public static int characterReplacement(String s, int k) {



        int count=0;
        int max_window_size=0;

        HashMap<Character,Integer> map=new HashMap<>();

        int start=0;
        int end=0;


        while (end<s.length())
        {
            char curr=s.charAt(end);
            map.put(curr, map.getOrDefault(curr,0)+1);
            count=Math.max(count,map.get(curr));


            while(end-start+1-count>k)
            {
                
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                start++;



            }

            if(end-start+1-count<=k)
            {
               max_window_size=Math.max(max_window_size,end-start+1);

            }
            end++;




        }
        return max_window_size;





    }

    public static void main(String[] args) {
        String s = "AABEAFAABEAFA";
        //AABE
        //count-2 -A/1
        //MAX-3/3
        //CURR-4/3
        int k = 1;
        System.out.println(characterReplacement(s,k));
    }
}
