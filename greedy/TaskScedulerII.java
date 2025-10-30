import java.util.ArrayList;
import java.util.HashMap;

public class TaskScedulerII {

    public static long taskSchedulerII(int[] tasks, int space) {
        HashMap<Integer, Integer> map=new HashMap<>();
        ArrayList<Integer> totalTasks=new ArrayList<>();

        int i=0;
        while (i<tasks.length)
        {
            int currTasks=tasks[i];
            if(!map.containsKey(currTasks))
            {
              map.put(currTasks,totalTasks.size());
              totalTasks.add(currTasks);
              i++;

            }
            else {
                if(totalTasks.size() - map.get(currTasks) >= space + 1)
                {
                    totalTasks.add(currTasks);
                    map.put(currTasks, totalTasks.size()-1);
                    i++;

                }
                else {
                    totalTasks.add(-1);
                }


            }


        }
        return totalTasks.size();



    }

    public static void main(String[] args) {

        int []tasks = {9,9,9,6,6,6,6};
        int space = 1;
        System.out.println(taskSchedulerII(tasks,space));

    }
}
