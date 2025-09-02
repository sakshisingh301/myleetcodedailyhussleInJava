import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            ArrayList<Integer> temp=new ArrayList<>();
            int queueSize= queue.size();


            for(int i=0;i<queueSize;i++)
            {
                TreeNode curr=queue.poll();
                if(curr!=null) {
                    temp.add(curr.val);
                    if (curr.left != null) {
                        queue.add(curr.left);
                    }
                    if (curr.right != null) {
                        queue.add(curr.right);
                    }
                }
            }
            res.add(temp);
        }
        return res;

    }

    public static void main(String[] args) {
      TreeNode root=new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(5);
        levelOrder(root);

    }
}
