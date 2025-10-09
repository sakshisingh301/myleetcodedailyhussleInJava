import java.util.HashMap;

public class FindTownJudge {

    public static int findJudge(int n, int[][] trust) {
        HashMap<Integer,Integer> trustCount =new HashMap<>();

        for(int i=1;i<=n;i++)
        {
            trustCount.put(i,0);
        }

        for(int i=0;i<trust.length;i++)
        {
            int p1=trust[i][0];
            int p2=trust[i][1];
            trustCount.put(p1, trustCount.get(p1)-1);
            trustCount.put(p2, trustCount.get(p2)+1);
        }

        for(int person: trustCount.keySet())
        {
            if(trustCount.get(person)==n-1)
            {
                return person;
            }

        }
        return -1;




    }

    public static void main(String[] args) {
        int n = 3;
        int [] []trust = {{1,3},{2,3}};
        System.out.println(findJudge(n, trust));

    }
}
