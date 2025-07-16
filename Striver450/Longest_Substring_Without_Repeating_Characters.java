import java.util.HashMap;
import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashMap=new HashMap<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length())
        {
            char c=s.charAt(j);
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
            int map_size= hashMap.size();
            if(map_size==j-i+1)
            {
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(map_size<j-i+1)
            {
                while (map_size!=j-i+1)
                {
                    if(hashMap.containsKey(s.charAt(i)))
                    {
                        hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))-1);
                        if(hashMap.get(s.charAt(i))==0)
                        {
                            hashMap.remove(s.charAt(i));
                        }
                        i++;
                    }
                }
                j++;
            }

        }
        return max;

    }

    public static int lengthOfLongestSubstringRevise(String s)
    {
        int i=0;
        int j=0;
        int longest_substring=0;
        HashMap<Character,Integer> map =new HashMap<>();
        while(j<s.length())
        {
            char curr=s.charAt(j);
            map.put(curr,map.getOrDefault(curr,0)+1);
            int map_size=map.size();
            if(map_size==j-i+1)
            {
                longest_substring=Math.max(longest_substring,j-i+1);
                j++;
            }
            else if(map_size<j-i+1)
            {
                while(j-i+1!=map_size)
                {
                    if(map.containsKey(s.charAt(i)))
                    {
                        map.put(s.charAt(i),map.get(s.charAt(i))-1);
                        if(map.get(s.charAt(i))==0)
                        {
                            map.remove(s.charAt(i));
                        }
                    }
                    i++;
                }
                j++;
            }
        }
        return longest_substring;

    }

    public static void main(String[] args) {

        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));

    }
}
