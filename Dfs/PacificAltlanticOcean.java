import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAltlanticOcean {




    //had difficulty writing this code, have to do it again
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        List<List<Integer>> res=new ArrayList<>();
        int row=heights.length;
        int column=heights[0].length;
        boolean [] [] pacific=new boolean[row][column];
        boolean[][] atlantic=new boolean[row][column];

        for(int i=0;i<column;i++)
        {
            dfs(heights,0,i, Integer.MIN_VALUE,pacific);
        }

        for(int i=0;i<row;i++)
        {
            dfs(heights,i,0, Integer.MIN_VALUE,pacific);
        }


        for (int i = 0; i < column; i++) {
            dfs(heights, row - 1, i, Integer.MIN_VALUE, atlantic);
        }
        for (int i = 0; i < row; i++) {
            dfs(heights, i, column - 1, Integer.MIN_VALUE, atlantic);
        }

        //get result
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(pacific[i][j] && atlantic[i][j])
                {
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }

    private void dfs(int [] [] heights, int i, int j, int prev, boolean [][] ocean)
    {
        //base condition
        if(i<0 || i>=heights.length || j<0 || j>= heights[0].length) return;
        //when water will not be able to flow from one cell to another
        if( heights[i][j]<prev || ocean[i][j]) return;

        ocean[i][j]=true;
        dfs(heights,i+1,j,heights[i][j],ocean);
        dfs(heights,i-1,j,heights[i][j],ocean);
        dfs(heights,i,j+1,heights[i][j],ocean);
        dfs(heights,i,j-1,heights[i][j],ocean);

    }

    public static void main(String[] args) {
        int [] [] heights = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
    }


}
