import java.util.HashMap;

public class Longest_substring_atmost_two_character {

    public static int lengthOfLongestSubstringTwoDistinct(String s) {

        int max=0;
        int i=0;
        int j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<s.length())
        {
            char c=s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);
            int map_size=map.size();
            if(map_size<=2)
            {
                max=Math.max(max, j-i+1);
                j++;
            }
            else if(map_size>2) {
                while(map_size>2)
                {
                    if( map.containsKey(s.charAt(i)))
                    {
                        map.put(s.charAt(i), map.get(s.charAt(i))-1);
                        if(map.get(s.charAt(i))==0)
                        {
                            map.remove(s.charAt(i));
                        }
                        i++;
                    }
                    map_size=map.size();
                }
                j++;

            }




        }
        return max;


    }

    public static void main(String[] args) {
        String s="eceba";
        System.out.println(lengthOfLongestSubstringTwoDistinct(s));
    }
}
