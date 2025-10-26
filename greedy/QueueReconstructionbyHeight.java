import java.util.ArrayList;
import java.util.Arrays;

public class QueueReconstructionbyHeight {

    public static int[][] reconstructQueue(int[][] people) {

        ArrayList<int []> result= new ArrayList<>();

        //sort the array in descending order based on the height
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) {
                // same height → sort by k ascending
                return Integer.compare(a[1], b[1]);
            } else {
                // different height → sort by height descending
                return Integer.compare(b[0], a[0]);
            }
        });

        for(int i=0;i< people.length;i++)
        {
            int currPosition=people[i][1];
            result.add(currPosition,people[i]);

        }
        return result.toArray(new int [result.size()][]);


    }

    public static void main(String[] args) {
      int [] [] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
      System.out.println(reconstructQueue(people));
        //[[7,0],[7,1],[6,1],[5,0],[5,2],[4,4]]
    }
}
