package ArraysQuestion;

public class ReverseString {

    public static void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;

        while(start<end)
        {
            char temp;
            temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }



    }

    public static void main(String[] args) {
      char[] s = new char[]{'h','e','l','l','o'};

    }
}
