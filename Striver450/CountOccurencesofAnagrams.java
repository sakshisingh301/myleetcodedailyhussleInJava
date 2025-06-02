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
    //s={cbaebabacd}
    //p={abc}
    public static List<Integer> findAnagrams(String s, String p) {
       return null;







        }

    public static void main(String[] args) {

       String s = "cbaebabacd";
       String p = "abc";
       System.out.println(findAnagrams(s,p));

    }

    }






