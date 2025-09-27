import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal_TriangleII {

    public List<Integer> getRow(int rowIndex) {

        //base condition
        if(rowIndex==0)
            return List.of(1);
        //hypothesis
        List<Integer> prev=getRow(rowIndex-1);

        //Induction
        List<Integer> curr=new ArrayList<>();
        curr.add(1);
        for(int i=1;i< prev.size();i++)
        {
            curr.add(prev.get(i)+prev.get(i-1));
        }
        curr.add(1);
        return curr;

    }

    public static void main(String[] args) {

    }
}
