import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountOccurencesofAnagrams {

   public static int  search(String pat, String txt) {
       char [] ch=pat.toCharArray();

        Arrays.sort(ch);
        String sortedPat=new String(ch);
        int count=0;
        int i=0;
        int j=0;
        StringBuilder curr=new StringBuilder();
        while(j<txt.length())
        {
             curr.append(txt.charAt(j));
             if(curr.length()<pat.length())
             {
                 j++;
             }
             else if(curr.length()==pat.length()) {
                 char [] sortedCurr=curr.toString().toCharArray();
                 Arrays.sort(sortedCurr);
                 String sortedCurrentString=new String(sortedCurr);
                 if(sortedPat.equals(sortedCurrentString))
                 {
                     count++;

                 }
                 curr.deleteCharAt(0);

                 j++;



             }


        }
        return count;


    }

    public List<Integer> findAnagrams(String s, String p) {

        HashMap<Character,Integer> map=new HashMap<>();
        List<Integer> result=new ArrayList<>();

        int window=p.length();
        for(char c: p.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int count=map.size();
        int i=0;
        int j=0;
        while(j<s.length())
        {
            char curr=s.charAt(j);
            if(map.containsKey(curr)) {
                map.put(curr, map.get(curr) - 1);
                if (map.get(curr) == 0) {
                    count--;
                }
            }

                if(j-i+1<window)
                {
                    j++;
                }
                else if(j-i+1==window)
                {
                    if(count==0)
                    {
                        result.add(i);
                    }
                    if(map.containsKey(curr))
                    {
                        map.put(curr,map.get(curr)+1 );
                        if(map.get(curr)==1)
                        {
                            count++;
                        }
                    }
                    j++;
                    i++;
                }
            }
            return result;


        }

    }




