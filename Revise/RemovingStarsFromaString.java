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

    public static void main(String[] args) {
      String  s = "leet**cod*e";
    }
}
