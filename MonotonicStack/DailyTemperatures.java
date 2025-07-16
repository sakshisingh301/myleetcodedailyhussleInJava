import java.util.Stack;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {

        int [] temp=new int[temperatures.length];
        int k=temp.length-1;


        Stack<Integer> stack=new Stack<>();




        for(int i=temperatures.length-1;i>=0;i--)
        {
          int curr=temperatures[i];

          if(stack.isEmpty())
          {
              temp[i]=0;
          }
          else {
              while (!stack.isEmpty() && temperatures[stack.peek()]<curr)
              {

               stack.pop();
              }
              if(!stack.isEmpty())
              {
                  temp[i]=stack.peek()-i;
              }
              else {
                  temp[i]=0;
              }


          }
          stack.push(i);
        }
        return temp;

    }


    public static void main(String[] args) {
        int [] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(dailyTemperatures(temperatures));

    }
}
