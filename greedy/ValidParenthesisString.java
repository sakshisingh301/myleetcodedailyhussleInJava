import java.util.Stack;

public class ValidParenthesisString {

    public static boolean checkValidString(String s) {

        Stack<Character> openBraces=new Stack<>();
        Stack<Character> star=new Stack<>();


        for (int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            if(curr=='(')
            {
                openBraces.push(curr);
            }
            else if(curr=='*' )
            {
                star.push(curr);

            }
            else if(curr==')' )
            {
                if(!openBraces.isEmpty())
                {
                    openBraces.pop();
                }
                else if(openBraces.isEmpty() && !star.isEmpty())
                {
                    star.pop();
                }
                else {
                    return false;
                }

            }

        }
       if(openBraces.isEmpty()){
           return true;
       }
       else {
           return false;
       }


    }

    public static void main(String[] args) {
        String s = "(*)";
        System.out.println(checkValidString(s));

    }
}
