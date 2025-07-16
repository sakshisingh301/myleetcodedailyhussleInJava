import java.util.Stack;

public class LargestRectangleInHistogram {


        public static int largestRectangleArea(int[] heights) {

            //find next smallest element to the right(nse_r)
            //find next smallest element to the left (nse_l)
            //find area(height of the bar * (nse_r-nse_l)-1)
            Stack<Integer> nse_r=new Stack<>();
            Stack<Integer> nse_l=new Stack<>();
            //next smallest element to the left
            int [] nextSmallestElementToTheLeft=new int[heights.length];
            for(int i=0;i<heights.length;i++)
            {
                if(nse_l.isEmpty())
                {
                    nextSmallestElementToTheLeft[i]=-1;
                }
                else {
                    while (!nse_l.isEmpty() && heights[nse_l.peek()]>=heights[i])
                    {
                        nse_l.pop();
                    }
                    if(nse_l.isEmpty())
                    {
                        nextSmallestElementToTheLeft[i]=-1;

                    }
                    else {
                        nextSmallestElementToTheLeft[i]=nse_l.peek();
                    }
                }
                nse_l.push(i);

            }

            int [] nextSmallestElementToTheRight=new int[heights.length];


            for(int i=heights.length-1;i>=0;i--)
            {
                if(nse_r.isEmpty())
                {
                    nextSmallestElementToTheRight[i]=heights.length;
                }
                else {
                    while (!nse_r.isEmpty() && heights[nse_r.peek()]>=heights[i])
                    {
                        nse_r.pop();
                    }
                    if(nse_r.isEmpty())
                    {
                        nextSmallestElementToTheRight[i]=heights.length;

                    }
                    else {
                        nextSmallestElementToTheRight[i]=nse_r.peek();
                    }
                }
                nse_r.push(i);

            }
            //calculate area
            int max=0;
            int area=0;
            for(int i=0;i<heights.length;i++)
            {
                int length=heights[i];
                int width=nextSmallestElementToTheRight[i]-nextSmallestElementToTheLeft[i]-1;
                area=length*width;
                max=Math.max(area,max);

            }
            return max;

        }



    public static void main(String[] args) {
       int []  heights = {2,1,5,6,2,3};
       //left {-1,-1,1,2,1,4}
        //right {1,6,4,4,6,6}
        System.out.println(largestRectangleArea(heights));



    }
}
