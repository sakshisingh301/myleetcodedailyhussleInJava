import java.util.Arrays;

public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int gas_sum= Arrays.stream(gas).sum();
        int cost_sum=Arrays.stream(cost).sum();
        if(gas_sum<cost_sum) return -1;
        int total=0;
        int start=0;
        for(int i=0;i<gas.length;i++)
        {
            int diff=gas[i]-cost[i];
             total=total+diff;

             if(total<0)
             {
                 total=0;
                 start=i+1;

             }
        }
        return start;


    }


    public static void main(String[] args) {
        int [] gas = {1,2,3,4,5};
        int [] cost = {3,4,5,1,2};

    }
}
