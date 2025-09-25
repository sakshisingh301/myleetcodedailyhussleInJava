import java.util.Stack;

public class SortAStack {

    public static Stack<Integer> sortAStack(Stack<Integer> stack)
    {
       recursivesort(stack);
       return stack;


    }

    private static void recursivesort(Stack<Integer> stack) {
        if(stack.isEmpty() || stack.size()==1)
        {
            return;
        }
        int temp=stack.pop();
        recursivesort(stack);
        insert(stack,temp);

    }

    private static void insert(Stack<Integer> stack, int element)
    {

        if(stack.isEmpty() || stack.peek()<=element)
        {
            stack.push(element);
            return;
        }
        int temp=stack.pop();

        insert(stack,element);
        stack.push(temp);

    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(4);
        stack.push(2);
        stack.push(8);
        System.out.println(sortAStack(stack));

    }
}
