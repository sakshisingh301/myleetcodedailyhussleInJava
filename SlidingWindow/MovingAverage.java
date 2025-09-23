import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

    private Queue<Integer> queue;
    private int size;
    private int sum;


    public MovingAverage(int size) {
       this.queue=new LinkedList<>();
       this.size=size;
       this.sum=0;


    }

    public double next(int val) {
        queue.add(val);
        sum=sum+val;
        if(!queue.isEmpty() &&queue.size()>size)
        {
            sum=sum- queue.poll();
        }
        return (double) sum / queue.size();

    }

}
