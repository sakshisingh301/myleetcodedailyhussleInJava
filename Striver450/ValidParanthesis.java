import java.util.Stack;

public class ValidParanthesis {

    public static boolean isValid(String s) {

        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            if(stack.isEmpty())
            {
                stack.push(curr);
            }
            else
            {
                if( stack.peek()=='(' && curr==')')
                {
                    stack.pop();
                }
                else if (stack.peek()=='[' && curr==']')
                {
                    stack.pop();
                }
                else if(stack.peek()=='{'&& curr=='}')
                {
                    stack.pop();
                }
                else {
                    stack.push(curr);

                }

            }

        }
        return stack.isEmpty();


    }

    public static void main(String[] args) {
        String  s = "([])";
        System.out.println(isValid(s));

    }
}
