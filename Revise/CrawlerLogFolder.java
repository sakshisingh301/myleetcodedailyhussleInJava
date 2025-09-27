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

    public static int minOperationsTwoPointer(String[] logs) {

        int i= logs.length-1;
        int skip=0;
        int min=0;


        while(i>=0)
        {
            if(logs[i].equals("../"))
            {
                skip++;
                i--;
            } else if (skip>0 && !logs[i].equals("./")) {
                skip--;
                i--;

            }
            else if(logs[i].endsWith("/") && !logs[i].equals("./") && !logs[i].equals("../"))
            {
                min++;
                i--;

            }
            else {
                i--;
            }
        }
        return min;

    }

    public static void main(String[] args) {
        String [] s={"lq3/","t5/","../","./","p7/","./","../"};
        System.out.println(minOperationsTwoPointer(s));

    }


}
