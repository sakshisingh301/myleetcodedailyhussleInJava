public class CountSubIslands {
    //very similar to Number of closed Island
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int countSubIsland=0;

        int row= grid2.length;
        int column=grid2[0].length;

        boolean[][] visited=new boolean[row][column];


        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(!visited[i][j] && grid2[i][j]==1)
                {
                    boolean[] isSubIsland = new boolean[]{true};
                    dfs(grid1,grid2, visited, i,j,isSubIsland);
                    if(isSubIsland[0])
                    {
                        countSubIsland++;
                    }
                }
            }
        }
        return countSubIsland;

    }

    private void dfs(int[][] grid1, int[][] grid2, boolean[][] visited, int i, int j,  boolean[] isSubIsland) {

        if(i<0 || i>= grid2.length || j<0 || j>=grid1[0].length || visited[i][j] || grid2[i][j]==0)
        {
            return;
        }
        if(grid1[i][j]==0)
        {
          isSubIsland[0]=false;
        }
        visited[i][j]=true;
        dfs(grid1,grid2,visited,i+1,j,isSubIsland);
        dfs(grid1,grid2,visited,i-1,j,isSubIsland);
        dfs(grid1,grid2,visited,i,j+1,isSubIsland);
        dfs(grid1,grid2,visited,i,j-1,isSubIsland);

    }

    public static void main(String[] args) {
        //grid1 = [[1,1,1,0,0],[0,1,1,1,1],[0,0,0,0,0],[1,0,0,0,0],[1,1,0,1,1]],
        // grid2 = [[1,1,1,0,0],
        //          [0,0,1,1,1],
        //          [0,1,0,0,0],
        //          [1,0,1,1,0],
        //          [0,1,0,1,0]]

    }
}
