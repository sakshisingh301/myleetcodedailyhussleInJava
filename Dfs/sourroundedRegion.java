public class sourroundedRegion {

    public void solve(char[][] board) {
        int row=board.length;
        int column=board[0].length;
        //iterate through the border and convert all 0 and their connected edges to 'S'
        //marked top and bottom as safe
        for(int i=0;i<column;i++)
        {
            if(board[0][i]=='O')
            {
                markAllEdgesDfs(board,0,i);
            }
            if(board[row-1][i]=='O')
            {
                markAllEdgesDfs(board,row-1,i);
            }

        }
        //left and right

        for(int i=0;i<row;i++)
        {
            if(board[i][0]=='O')
            {
                markAllEdgesDfs(board,i, 0);
            }
            if(board[i][column-1]=='O')
            {
                markAllEdgesDfs(board,i,column-1);

            }
        }


        //Iterate through the grid and convert all converted 'S' to original '0' and all remaining
        //0's to 'X'

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(board[i][j]=='O')
                {
                    board[i][j]='X';
                }
                else if(board[i][j]=='S')
                {
                    board[i][j]='O';
                }

            }
        }





    }

    private void markAllEdgesDfs(char[][] board, int i, int j) {
        if (i < 0 || i>=board.length|| j<0 || j>=board[0].length || board[i][j]=='X' ||board[i][j]=='S') {
            return;
        }

        board[i][j]='S';
        markAllEdgesDfs(board,i+1,j);
        markAllEdgesDfs(board,i-1,j);
        markAllEdgesDfs(board,i,j-1);
        markAllEdgesDfs(board,i,j+1);

    }


    public static void main(String[] args) {
    //    board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
    }
}
