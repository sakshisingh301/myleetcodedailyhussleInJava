import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class FindKClosestElements {

    public static int getInsertedIndex(int [] arr, int x)
    {
       int start=0;
        int end=arr.length-1;
        int insertedIndex=-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==x)
            {
                insertedIndex=mid;
               return insertedIndex;
            }
            else if(arr[mid]>x)
            {
                end=mid-1;
            }
            else if(arr[mid]<x){
                start=mid+1;
            }

        }
        return start;
    }
  //binary search approach
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int insertedIndex=getInsertedIndex(arr,x);

        ArrayList<Integer> temp = new ArrayList<>();
        if(insertedIndex!=0 && insertedIndex!=arr.length-1 && insertedIndex!=-1) {

            int start = insertedIndex-1;
            int end = insertedIndex ;


            while (k > 0) {
                if (start>=0 && end<arr.length && Math.abs(x - arr[start]) <= Math.abs(x - arr[end])) {
                    temp.add( arr[start]);
                    start--;
                    k--;
                } else if (start>=0 && end<arr.length && Math.abs(x - arr[start]) > Math.abs(x - arr[end])) {
                    temp.add( arr[end]);
                    end++;
                    k--;
                }
                else
                {
                    if(end==arr.length)
                    {
                        while(k>0) {
                            temp.add(arr[start]);
                            start--;
                            k--;
                        }
                    }
                    else
                    {
                        while (k>0) {
                            temp.add(arr[end]);
                            end++;
                            k--;
                        }
                    }

                }
            }

        }
        else {
            if(insertedIndex==0)
            {
                for(int i=0;i<k;i++)
                {
                    temp.add(arr[i]);
                }
            }
            else if(insertedIndex==arr.length-1)
            {
                if(arr.length>2)
                {
                    for(int i=arr.length-k;i<arr.length;i++)
                    {
                        temp.add(arr[i]);
                    }

                }
                else {
                    temp.add(arr[0]);
                }


            }
        }
        Collections.sort(temp);
        return temp;

    }

    //sliding window approach

    public static List<Integer> findClosestElementsSlidingWindow(int[] arr, int k, int x) {

        int start=0;
        int end=arr.length-1;
        while((end-start)>k)
        {
            if(Math.abs(arr[start]-x)>(Math.abs(arr[end]-x)))
            {
                start++;
            }
            else {
                end--;
            }
        }

        List<Integer> res=new ArrayList<>();
        for(int i=start;i<=end;i++)
        {
            res.add(arr[i]);
        }
        return res;

    }

//    public static List<Integer> findClosestElementsHeap(int[] arr, int k, int x) {
//
////        PriorityQueue<int [] > pq=new PriorityQueue<>((a,b)=>{
////            if(a.va)
////        });
//
//
//
//    }



    public static void main(String[] args) {
      int []  arr = {1,2,3,4,5};
      int k = 4;
      int x = 3;

    }
}
