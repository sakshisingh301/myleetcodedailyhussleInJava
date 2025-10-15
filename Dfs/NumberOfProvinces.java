public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {

        int noOfCities= isConnected.length;
        boolean[] visited=new boolean[noOfCities];
        int noOfProvinces=0;

        for(int i=0;i<noOfCities;i++)
        {
            if(!visited[i])
            {
                noOfProvinces++;
                dfs(isConnected, visited,i,noOfCities);
            }


        }
        return noOfProvinces;

    }

    private void dfs(int[][] isConnected, boolean[] visited, int curr, int noOfCities) {
      for(int i=0;i<noOfCities;i++)
      {
          if(isConnected[curr][i]==1 && !visited[i])
          {
              visited[i]=true;
              dfs(isConnected,visited,i,noOfCities);
          }
      }


    }

    public static void main(String[] args) {

    }
}
