import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }



    public static int maxDepth(TreeNode root) {
        if(root==null) return 0;

        int level=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            int queueSize= queue.size();
            level++;


           for(int i=0;i<queueSize;i++) {
               TreeNode curr=queue.poll();

               if (curr != null && curr.left != null) {
                   queue.add(curr.left);
               }
               if (curr != null && curr.right != null) {
                   queue.add(curr.right);
               }
           }

        }
        return level;

    }
}
