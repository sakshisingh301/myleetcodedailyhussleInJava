import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagram {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result=new ArrayList<>();
        HashMap<String, List<String>> map=new HashMap<>();

        for(String str: strs)
        {
            char [] curr=str.toCharArray();
            Arrays.sort(curr);
            String key=String.valueOf(curr);
            if(!map.containsKey(curr))
            {
                map.put(key, new ArrayList<>());
            }
            else {
                map.get(key).add(key);
            }

        }
        return new ArrayList<>(map.values());

    }

    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
    }
}
