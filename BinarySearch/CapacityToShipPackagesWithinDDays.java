import java.util.Arrays;

public class CapacityToShipPackagesWithinDDays {

    private static int calculateHoursTookToShip(int hour, int [] weights)
    {

        int currentLoad=0;
        int days=1;
       for(int weight: weights)
       {
           if(currentLoad+weight>hour)
           {
               days++;
               currentLoad=0;
           }
           currentLoad=currentLoad+weight;

       }
       return days;
    }

    public static int shipWithinDays(int[] weights, int days) {

        int max= Arrays.stream(weights).max().getAsInt();
        int sum=Arrays.stream(weights).sum();
        int minimumDays=sum;
        int start=max;
        int end=sum;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            int hours=calculateHoursTookToShip(mid,weights);
            if(hours<=days)
            {
                minimumDays=mid;
                end=mid-1;

            }
            else {
                start=mid+1;
            }

        }
        return minimumDays;

    }
    public static void main(String[] args) {
       int [] weights = {1,2,3,4,5,6,7,8,9,10};
       int  days = 5;
       System.out.println(shipWithinDays(weights,days));
    }
}
