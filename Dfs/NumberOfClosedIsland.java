public class NumberOfClosedIsland {

    public  int closedIsland(int[][] grid) {
        int row= grid.length;
        int column=grid[0].length;
        boolean [][] visited=new boolean[row][column];
        int closedIsland=0;

        for(int i=1;i<row-1;i++)
        {
            for(int j=1;j<column-1;j++)
            {
                if(grid[i][j]==0 && !visited[i][j])
                {
                    boolean[] isClosed = new boolean[]{true};
                    dfs(grid, i, j, visited, isClosed);
                    if(isClosed[0])
                    {
                        closedIsland++;
                    }

                }

            }
        }
        return closedIsland;



    }

    private  void dfs(int[][] grid, int i, int j, boolean[][] visited, boolean[] isClosed) {

        if (i < 0 || j<0 ||i>=grid.length || j>=grid[0].length || visited[i][j] || grid[i][j]==1) {
            return;
        }
        if(i==0 || j==0||i== grid.length-1 || j==grid[0].length-1)
        {
            isClosed[0]=false;

        }

        visited[i][j]=true;
        dfs(grid, i+1,j,visited, isClosed);
        dfs(grid, i-1,j,visited,isClosed);
        dfs(grid, i,j+1,visited, isClosed);
        dfs(grid, i,j-1,visited,isClosed);

    }

    public static void main(String[] args) {
        //grid = [[1,1,1,1,1,1,1,0],[1,0,0,0,0,1,1,0]
        // ,[1,0,1,0,1,1,1,0],[1,0,0,0,0,1,0,1],[1,1,1,1,1,1,1,0]]

    }
}
