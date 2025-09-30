public class PerimeterOfIsland {

    public  int islandPerimeter(int[][] grid) {

        int row= grid.length;
        int column=grid[0].length;
        boolean [] [] visited=new boolean[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(grid[i][j]==1)
                {
                    visited[i][j]=true;
                    return dfs(grid,i,j,visited,row,column);

                }
            }
        }
        return 0;



    }

    private  int dfs (int [] [] grid, int i,int j,boolean[][] visited,int row,int column)
    {
        if(i<0 || i>=row|| j<0 ||j>=column)
        {
            return 1;
        }
        if(grid[i][j]==0)
        {
            return 1;
        }
        if(visited[i][j])
        {
            return 0;
        }
        visited[i][j]=true;
        int perimeter=0;
        perimeter=perimeter+dfs(grid,i-1,j,visited,row,column);
        perimeter=perimeter+dfs(grid,i+1,j,visited,row,column);
        perimeter=perimeter+dfs(grid,i,j-1,visited,row,column);
        perimeter=perimeter+dfs(grid,i,j+1,visited,row,column);
        return perimeter;

    }

    public static void main(String[] args) {
        //grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]

    }
}
