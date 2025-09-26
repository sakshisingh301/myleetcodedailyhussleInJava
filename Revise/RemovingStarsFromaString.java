import java.util.Stack;

public class RemovingStarsFromaString {

    public String removeStars(String s) {

        Stack<Character> stack=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            if(curr=='*')
            {
                stack.pop();
            }
            else {
                stack.push(curr);
            }
        }
        while(!stack.isEmpty())
        {
            res.append(stack.pop());
        }
        return res.reverse().toString();

    }

    public static String removeStarsTwoPointer(String s)
    {
        int skipStar=0;
        StringBuilder stringBuilder=new StringBuilder();
        int i=s.length()-1;

       while(i>=0)
       {
           if(s.charAt(i)=='*')
           {
               skipStar++;
               i--;
           }
           else if(skipStar>0)
           {
               i--;
               skipStar--;
           }
           else {
               stringBuilder.append(s.charAt(i));
               i--;
           }

       }
       return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
      String  s = "leet**cod*e";
      System.out.println(removeStarsTwoPointer(s));
    }
}
