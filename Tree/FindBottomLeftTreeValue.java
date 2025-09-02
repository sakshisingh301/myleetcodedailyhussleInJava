import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftTreeValue {

    public static class TreeNode {
        int val;
      TreeNode right;
      TreeNode left;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public int findBottomLeftValue(TreeNode root) {


        if(root==null) return 0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int res=0;

        while(!queue.isEmpty())
        {
            int size= queue.size();

            for(int i=0;i<size;i++)
            {
                TreeNode curr=queue.poll();
                 if(i==0)
                 {
                     res= curr.val;
                 }
                if(curr!=null && curr.left!=null)
                {
                    queue.add(curr.left);
                }
                if(curr!=null && curr.right!=null)
                {
                    queue.add(curr.right);
                }

            }
        }
        return res;


    }

    public static void main(String[] args) {

    }
}
