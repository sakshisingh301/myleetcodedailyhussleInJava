import java.util.HashMap;

public class LongestSubstringwithAtMostKDistinctCharacters {

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();

        int start=0;
        int end=0;
        int max=0;

        while(end<s.length())
        {
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
            int map_size= map.size();
            if(map_size<=k)
            {
                max=Math.max(max,end-start+1);

            }
            else {
                while(map_size!=k)
                {
                    map.put(s.charAt(start),map.get(s.charAt(start))-1);
                    if(map.get(s.charAt(start))==0)
                    {
                        map.remove(s.charAt(start));
                    }
                    start++;
                    map_size=map.size();
                }

            }


            end++;

        }
        return max;

    }


    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println(lengthOfLongestSubstringKDistinct(s,k));

    }
}
