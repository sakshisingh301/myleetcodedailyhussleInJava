import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

    Queue<Integer> queue1;
    Queue<Integer> queue2;


    public ImplementStackUsingQueues() {
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();

    }

    public void push(int x) {

       queue2.add(x);
       while(!queue1.isEmpty())
       {
           queue2.add(queue1.peek());
           queue1.poll();
       }

       while(!queue2.isEmpty())
       {
           queue1.add(queue2.peek());
           queue2.poll();

       }


    }

    public int pop() {
       return !queue1.isEmpty()? queue1.poll():0;

    }

    public int top() {
        return !queue1.isEmpty()?queue1.peek():0;

    }

    public boolean empty() {
        return queue1.isEmpty();

    }
}
