public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        int i=0;
        int j=0;
        if(s.isEmpty()) return true;

        while(j<t.length() && i<s.length())
        {
            if(s.charAt(i)==t.charAt(i))
            {
                i++;
            }
            j++;
        }
        return i==s.length();

    }

    public static void main(String[] args) {
       String s = "abc", t = "ahbgdc";
    }
}
