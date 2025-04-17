package ArraysQuestion;

public class ReverseStringII {
    private static void  swap(char [] c, int start, int end)
    {
        while(start<end)
        {
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;
            end--;

        }


    }



    public static String reverseStr(String s, int k) {

      char [] c=s.toCharArray();
      int i=0;
      int n=s.length();
      while(i<n)
      {
          int start=i;
          int end=Math.min(i + k - 1, n - 1);
          swap(c,start,end);
          i=i+2*k;
      }
        return String.valueOf(c);

    }


    public static void main(String[] args) {
       String s = "abcdefg";
       int k = 2;
       System.out.println(reverseStr(s,k));

    }
}
