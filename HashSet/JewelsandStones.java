import java.util.HashSet;

public class JewelsandStones {

    public int numJewelsInStones(String jewels, String stones) {
        int countJewels=0;
        HashSet<Character> jewelsMap=new HashSet<>();
        for(int i=0;i<jewels.length();i++)
        {
            jewelsMap.add(jewels.charAt(i));
        }

        for(Character c: stones.toCharArray())
        {
            if(jewelsMap.contains(c))
            {
                countJewels++;
            }
        }
        return countJewels;

    }

    public static void main(String[] args) {
       String jewels = "aA";
       String stones = "aAAbbbb";
    }
}
