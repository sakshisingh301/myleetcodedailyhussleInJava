import java.util.HashSet;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        int N=9;
        HashSet<Character> []rows=new HashSet[N];
        HashSet<Character> [] columns=new HashSet[N];
        HashSet<Character> [] grids=new HashSet[N];

        for(int i=0;i<N;i++)
        {
            rows[i]=new HashSet<Character>();
            columns[i]=new HashSet<Character>();
            grids[i]=new HashSet<Character>();
        }

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                char curr=board[i][j];
                if(curr=='.')
                    continue;
                if(rows[i].contains(curr))
                {
                    return false;
                }
                rows[i].add(curr);
                if( columns[j].contains(curr))
                {
                    return false;
                }
                columns[j].add(curr);
                int index=i/3*3+j/3;
                if(grids[index].contains(curr))
                {
                    return false;
                }
                grids[index].add(curr);

            }
        }
        return false;

    }
}
