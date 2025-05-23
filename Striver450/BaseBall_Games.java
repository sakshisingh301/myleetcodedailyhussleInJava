import java.util.Stack;

public class BaseBall_Games {

    public static int calPoints(String[] operations) {

        Stack<Integer> stack=new Stack<>();
        int res=0;

        for(String word: operations) {
            try {
                int num = Integer.parseInt(word);
                stack.push(num);
            } catch (NumberFormatException e) {
                if(!stack.isEmpty() && word.equals("C"))
                {
                    stack.pop();
                }
                else if(!stack.isEmpty() && word.equals("D"))
                {
                    int prev=stack.peek();
                   stack.push(2*prev);

                }
                else if(!stack.isEmpty() && word.equals("+"))
                {
                    int prev= stack.peek();
                    stack.pop();
                    int prevToPrev=stack.peek();
                    int sum=prev+prevToPrev;
                    stack.push(prev);
                    stack.push(sum);
                }

            }
        }
        while (!stack.isEmpty())
        {
            res=res+stack.pop();
        }
        return res;



//        for(String word: operations)
//        {
//           char curr=word.charAt(0);
//           if(Character.isDigit(curr))
//           {
//                   stack.push(Character.getNumericValue(curr));
//           }
//           else if(!stack.isEmpty() && curr=='C')
//           {
//               stack.pop();
//           }
//           else if(!stack.isEmpty() && curr=='D' )
//           {
//               int prev=stack.peek();
//               stack.push(2*prev);
//           }
//           else if(!stack.isEmpty() && curr=='+')
//           {
//               int prev= stack.peek();
//               stack.pop();
//               int prevToPrev=stack.peek();
//               int sum=prev+prevToPrev;
//               stack.push(prev);
//               stack.push(sum);
//
//           }
//
//        }
//
//        while(!stack.isEmpty())
//        {
//            res=res+stack.pop();
//
//        }
//        return res;

    }

    public static void main(String[] args) {
        String [] ops = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));
    }
}
