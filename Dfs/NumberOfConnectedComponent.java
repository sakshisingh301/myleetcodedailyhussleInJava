import java.util.ArrayList;
import java.util.List;

public class NumberOfConnectedComponent {

    public  int countComponents(int n, int[][] edges) {

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited=new boolean[n];
        int no_of_component=0;
        for(int i=0;i<n ;i++)
        {
            if(!visited[i]) {
                dfs(edges, adj, visited, n,i);
                no_of_component++;
            }
        }

        return no_of_component;

    }

    private  void dfs(int[][] edges, List<List<Integer>> adj, boolean[] visited, int n, int node) {

        visited[node]=true;
        //visit all neighbours
        for(int neighbour: adj.get(node))
        {
            if(!visited[neighbour])
            {
                visited[neighbour]=true;
                dfs(edges,adj,visited,n,neighbour);

            }
        }




    }

    public static void main(String[] args) {
       int  n = 5;
       int [] [] edges = {{0,1},{1,2},{3,4}};



    }
}
