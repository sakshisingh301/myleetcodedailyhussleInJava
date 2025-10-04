public class Floodfill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int row= image.length;
        int column=image[0].length;

        boolean [] [] visited=new boolean[row][column];
        int original_color=image[sr][sc];

        if(original_color==color) return image;
        dfs(image, sr, sc, original_color,color,visited);
        return image;


    }

    private void dfs(int [][] image, int i, int j, int original_color, int color, boolean [][] visited)
    {
        //out of bound, when cell is already visited, when cell is 0
        //example at image[1][1], color==1 so all the cells which are 1 will be colored but 0 will be ignored
        if(i<0||i>= image.length ||j<0 || j>=image[0].length ||visited[i][j] || image[i][j]!=original_color) return;

        visited[i][j]=true;
        image[i][j]=color;

        dfs(image,i+1,j,original_color,color, visited);
        dfs(image,i-1,j,original_color,color, visited);
        dfs(image,i,j+1,original_color,color, visited);
        dfs(image,i,j-1,original_color,color, visited);



    }


    public static void main(String[] args) {
        //image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
    }
}
