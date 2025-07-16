import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class KthSmallestElementinaSortedMatrix {


    public static int kthSmallest(int[][] matrix, int k) {


        PriorityQueue<int [] > min_heap=new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        min_heap.add(new int[]{matrix[0][0],0,0});
        int ans=-1;
        Set<String> visited=new HashSet<>();
        visited.add("0,0");

        //next possible pair- { {i,j+1}, {i+1,j}}

        while(k>0 && !min_heap.isEmpty())
        {

            int [] temp=min_heap.poll();
            int index1=temp[1];
            int index2=temp[2];
            ans=matrix[index1][index2];

            //{ { index1, index2+1} ,{index1+1,index2}}
            if(index2+1<matrix[0].length)
            {
                String key = index1 + "," + (index2 + 1);

                if(!visited.contains(key) )
                {
                    min_heap.add(new int[]{matrix[index1][index2+1], index1,index2+1});
                    visited.add(key);
                }

            }
            if(index1+1<matrix.length)
            {
                String key = (index1 + 1) + "," + index2;

                if(!visited.contains(key) )
                {
                    min_heap.add(new int[]{matrix[index1+1][index2], index1+1,index2});
                    visited.add(key);

                }

            }

            k--;


        }
        return ans;



    }


    public static void main(String[] args) {

       int [] [] matrix = {{1,5,9},{10,11,13},{12,13,15}};
       int k = 8;
       System.out.println(kthSmallest(matrix,k));


    }
}
