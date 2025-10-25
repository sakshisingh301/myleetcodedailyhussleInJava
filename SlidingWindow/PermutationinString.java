import java.util.HashMap;

public class PermutationinString {

    public static boolean checkInclusion(String s1, String s2) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }

        int potential_start=0;
        int end=0;
        int window_length=s1.length();

        while(potential_start<=s2.length()-window_length)
        {
            if(map.containsKey(s2.charAt(potential_start)))
            {
               end=potential_start+window_length;
                HashMap<Character,Integer> map1=new HashMap<>();
               for(int i=potential_start;i<end && i<s2.length() ;i++)
               {

                   map1.put(s2.charAt(i),map1.getOrDefault(s2.charAt(i),0)+1);
               }
               if(map1.equals(map)) {
                   return true;
               }


            }
            potential_start++;
        }
        return false;

    }

    public static void main(String[] args) {

        String s1 = "abb", s2 = "ddc";
        System.out.println(checkInclusion(s1,s2));

    }
}
