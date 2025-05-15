import java.util.*;

public class TwoSumIIIDatastructuredesign {

    ArrayList<Integer> arrayList;
    boolean is_sorted;


    public TwoSumIIIDatastructuredesign() {
        this.arrayList = new ArrayList<>();
        this.is_sorted = false;
    }


    public void add(int number) {
        this.arrayList.add(number);
        this.is_sorted = false;
    }

//sort the arraylist and use two pointer
    public boolean find(int value) {
        if (!this.is_sorted) {
            Collections.sort(arrayList);
            this.is_sorted = true;
        }
        int low = 0;
        int high = this.arrayList.size() - 1;

        while(low<high)
        {
            int sum=this.arrayList.get(low)+this.arrayList.get(high);
            if(sum>value)
            {
                high--;
            }
            else if(sum<value)
            {
                low++;
            }
            else {
                return true;
            }
            return false;
        }
        return false;
    }
}




