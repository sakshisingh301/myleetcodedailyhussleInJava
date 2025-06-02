import java.util.Stack;

public class Min_Stack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public Min_Stack() {
        stack=new Stack<>();
        minStack=new Stack<>();

    }

    public void push(int val) {

        if(minStack.isEmpty() || val<=minStack.peek())
        {
            minStack.push(val);
        }
        stack.push(val);

    }

    public void pop() {
        if(!stack.isEmpty() && !minStack.isEmpty() && minStack.peek().equals(stack.peek()))
        {
            minStack.pop();
        }
        stack.pop();

    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {

      return minStack.peek();

    }
}


//["MinStack","push","push","push","push","pop","getMin","pop","getMin","pop","getMin"]
//[[],[512],[-1024],[-1024],[512],[],[],[],[],[],[]]
//[null,null,null,null,null,null,-1024,null,-1024,null,-1024]
//[null,null,null,null,null,null,-1024,null,-1024,null,512]