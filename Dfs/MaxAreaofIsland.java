public class MaxAreaofIsland {

    public  int maxAreaOfIsland(int[][] grid) {
        int row= grid.length;;
        int column=grid[0].length;
        int maxArea=0;
        boolean [] [] visited=new boolean[row][column];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(grid[i][j]==1 && !visited[i][j])
                {

                  int area=  dfs(grid, i ,j, visited);
                  maxArea=Math.max(area,maxArea);

                }
            }
        }
        return maxArea;



    }

    private  int dfs(int[][] grid, int i, int j, boolean[][] visited) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length|| grid[i][j]==0 || visited[i][j])
        {
            return 0;
        }

        visited[i][j]=true;
        int area=1;

       area=area+dfs(grid, i-1,j,visited);
        area=area+dfs(grid, i+1,j,visited);
        area=area+dfs(grid, i,j+1,visited);
        area=area+dfs(grid, i,j-1,visited);
        return area;
    }

    public static void main(String[] args) {
        //grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],
        // [0,0,0,0,0,0,0,1,1,1,0,0,0],
        // [0,1,1,0,1,0,0,0,0,0,0,0,0],
        // [0,1,0,0,1,1,0,0,1,0,1,0,0],
        // [0,1,0,0,1,1,0,0,1,1,1,0,0],
        // [0,0,0,0,0,0,0,0,0,0,1,0,0],
        // [0,0,0,0,0,0,0,1,1,1,0,0,0],
        // [0,0,0,0,0,0,0,1,1,0,0,0,0]]

    }
}
