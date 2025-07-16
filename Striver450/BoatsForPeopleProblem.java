import java.util.Arrays;

public class BoatsForPeopleProblem {

    public int numRescueBoats(int[] people, int limit) {

        int count=0;
        int start=0;
        int end=people.length-1;
        Arrays.sort(people);

        while(start<=end)
        {
            int sum=people[start]+people[end];
            if(sum>limit)
            {
                end--;

            }
            else if(sum<=limit)
            {
               start++;
               end--;
            }
            count++;

        }
        return count;

    }


    public static void main(String[] args) {
        int [] people={3,2,2,1};
        //1,2,2,3
        int limit=3;

    }
}
