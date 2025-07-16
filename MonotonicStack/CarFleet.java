import java.util.Arrays;
import java.util.Stack;

public class CarFleet {

    public static int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int fleet=0;
        Stack<Double> stack=new Stack<>();

      double[] [] res=new double[n][2];

      for(int i=0;i<n;i++ )
      {
          res[i][0]=position[i];
          res[i][1]= (double) (target - position[i]) /speed[i];

      }
        Arrays.sort(res, (a,b)->Double.compare(b[0],a[0]));

      for(double[] x:res)
      {
          double time=x[1];
          while(stack.isEmpty()|| time>stack.peek())
          {
              stack.push(time);
          }
      }
      return stack.size();




    }

    public static void main(String[] args) {
        int target = 12;
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};
        System.out.println(carFleet(target,position,speed));

    }
}
