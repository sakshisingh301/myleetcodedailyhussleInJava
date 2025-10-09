public class NumberofEnclaves {

    public int numEnclaves(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        boolean[][] visited = new boolean[row][column];

        // Top and bottom rows
        for (int i = 0; i < column; i++) {
            if (grid[0][i] == 1 && !visited[0][i]) {
                dfs(grid, visited, 0, i, row, column);
            }
            if (grid[row - 1][i] == 1 && !visited[row - 1][i]) {
                dfs(grid, visited, row - 1, i, row, column);
            }
        }

        // Left and right columns
        for (int i = 0; i < row; i++) {
            if (grid[i][0] == 1 && !visited[i][0]) {
                dfs(grid, visited, i, 0, row, column);
            }
            if (grid[i][column - 1] == 1 && !visited[i][column - 1]) {
                dfs(grid, visited, i, column - 1, row, column);
            }
        }

        // Count remaining enclaves
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(int[][] grid, boolean[][] visited, int i, int j, int row, int column) {
        if (i < 0 || j < 0 || i >= row || j >= column || visited[i][j] || grid[i][j] != 1) {
            return;
        }

        visited[i][j] = true;
        grid[i][j] = 2; // Mark as boundary-connected

        dfs(grid, visited, i + 1, j, row, column);
        dfs(grid, visited, i - 1, j, row, column);
        dfs(grid, visited, i, j + 1, row, column);
        dfs(grid, visited, i, j - 1, row, column);
    }

    public static void main(String[] args) {
        NumberofEnclaves obj = new NumberofEnclaves();

        int[][] grid1 = {
                {0,0,1,0},
                {0,1,1,0},
                {1,1,0,0},
                {0,0,0,0}
        };
        System.out.println("Output 1: " + obj.numEnclaves(grid1)); // Expected: 0

        int[][] grid2 = {
                {0,0,0,0},
                {0,1,1,0},
                {0,0,1,0},
                {0,0,0,0}
        };
        System.out.println("Output 2: " + obj.numEnclaves(grid2)); // Expected: 3
    }
}
