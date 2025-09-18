import java.util.Stack;

public class CrawlerLogFolder {

    public static int minOperations(String[] logs) {

        Stack<String> stack=new Stack<>();

        for(int i=0;i< logs.length;i++)
        {
            String curr=logs[i];
            if(!stack.isEmpty() &&curr.equals("../"))
            {
                stack.pop();
            }
            else if(curr.equals("./"))
            {
                continue;
            }
            else if(curr.endsWith("/") && !curr.equals("../"))
            {

                stack.push(curr);
            }

        }
        if(stack.isEmpty())
        {
            return 0;
        }
        else {
            return stack.size();
        }


    }

    public static void main(String[] args) {
        String [] s={"./","../","./"};
        minOperations(s);
    }


}
