import java.util.Arrays;

public class KokoEatingBananas {

    public static int minEatingSpeed(int[] piles, int h) {

        int max_element=Integer.MIN_VALUE;
        for (int j : piles) {
            if (j > max_element) {
                max_element = j;
            }
        }
        int start=1;
        int end=max_element;
        int minEatingSpeed=0;

        while (start<=end)
        {
            int mid=  start + (end - start) / 2;
            int hours=0;

            for(int  pile: piles)
            {
               hours= (int) (hours+Math.ceil((double) pile/mid));
            }
            if(hours<=h)
            {
                minEatingSpeed=mid;
               end= mid-1;
            }
            else
            {

                start=mid+1;
            }

        }
        return minEatingSpeed;

    }

    public static void main(String[] args) {
       int [] piles = {3,6,7,11};
       int h = 8;
       System.out.println(minEatingSpeed(piles,h));
    }
}
