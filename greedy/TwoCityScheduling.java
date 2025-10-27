import java.util.Arrays;

public class TwoCityScheduling {

    public static int twoCitySchedCost(int[][] costs) {
        int min_cost=0;
        int total=costs.length;

        Arrays.sort(costs, (x, y) -> (x[1] - x[0]) - (y[1] - y[0]));

        //send first n to city b
        for(int i=0;i<total/2;i++)
        {
            min_cost=min_cost+costs[i][1];
        }


        //send last n to city a
        for(int i=total/2;i<total;i++)
        {
            min_cost=min_cost+costs[i][0];
        }


        //return total cost
        return min_cost;





    }

    public static void main(String[] args) {

    int [] [] costs = {{10,20},{30,200},{400,50},{30,20}};
    System.out.println(twoCitySchedCost(costs));


    }
}
