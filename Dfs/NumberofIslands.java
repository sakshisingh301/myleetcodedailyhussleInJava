public class NumberofIslands {

    public int numIslands(char[][] grid) {

        int row=grid.length;
        int column=grid[0].length;
        int no_of_island=0;
        boolean [] [] visited=new boolean[row][column];

        for(int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                if(grid[i][j]=='1' && !visited[i][j])
                {
                    dfs(grid,i,j,visited);
                    no_of_island++;

                }
            }
        }
        return no_of_island;

    }

    private void dfs(char[][] grid, int i,int j, boolean[][] visited)
    {
        if (i < 0 ||i>=grid.length || j<0 ||j>=grid[0].length || visited[i][j] || grid[i][j]=='0') return;
        visited[i][j]=true;
        dfs(grid, i+1,j,visited);
        dfs(grid, i-1,j,visited);
        dfs(grid, i,j+1,visited);
        dfs(grid, i,j-1,visited);
    }

    public static void main(String[] args) {
        //Input: grid = [
        //  ["1","1","1","1","0"],
        //  ["1","1","0","1","0"],
        //  ["1","1","0","0","0"],
        //  ["0","0","0","0","0"]
        //]

    }
}
