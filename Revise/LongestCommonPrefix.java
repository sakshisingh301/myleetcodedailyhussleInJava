import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        String first=strs[0];
        String last=strs[strs.length-1];
        String result="";

        int length=first.length();
        int index=0;

        while(index<length)
        {
            if(first.toCharArray()[index]==last.toCharArray()[index])
            {
                index++;
            }
            else {
                break;
            }
        }

        result=first.substring(0,index);

        return result;
    }

    public static void main(String[] args) {

    }
}
