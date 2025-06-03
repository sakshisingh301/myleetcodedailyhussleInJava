import java.util.HashMap;

public class Longest_substring_with_atmost_k_distinct_character {

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {

        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        int i=0;
        int j=0;
        while(j<s.length())
        {
            char c=s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);
            int map_size= map.size();

            if(map_size<k ||map_size==k )
            {
                max=Math.max(max, j-i+1);
                j++;

            }
            else {
                while (map_size!=k)
                {
                    if(map.containsKey(s.charAt(i)))
                    {
                        map.put(s.charAt(i),map.get(s.charAt(i))-1);
                        if(map.get(s.charAt(i))==0)
                        {
                            map.remove(s.charAt(i));

                        }
                        map_size=map.size();
                        i++;
                    }
                }
                j++;
            }

        }
        return max;

    }

    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println(lengthOfLongestSubstringKDistinct(s,k));

    }
}
