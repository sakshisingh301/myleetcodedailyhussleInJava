import java.util.ArrayList;
import java.util.List;

public class NoOfProvinces2 {

    public int findCircleNum(int[][] isConnected) {

        int noOfCities=isConnected.length;
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<noOfCities;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<isConnected.length;i++)
        {
            for(int j=0;j<isConnected[0].length;j++)
            {
                if(i!=j && isConnected[i][j]==1 )
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        int noOfProvinces=0;
        boolean[] visited=new boolean[noOfCities];

        for(int i=0;i<noOfCities;i++)
        {
            if(!visited[i])
            {
                noOfProvinces++;
                dfs(adj, i, visited);
            }
        }
        return noOfProvinces;
    }

    private void dfs(List<List<Integer>> adj, int node, boolean[] visited) {
        visited[node]=true;
        for(int neighbour: adj.get(node))
        {
            if(!visited[neighbour]) {
                visited[neighbour] = true;
                dfs(adj, neighbour, visited);
            }
        }
    }


    public static void main(String[] args) {

    }
}
