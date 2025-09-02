import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthofBinaryTreeQueue {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static int minDepth(TreeNode root) {

        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;

        Queue<TreeNode> queue=new LinkedList<>();
        int level=0;
        int depth=Integer.MAX_VALUE;
        queue.add(root);

        while(!queue.isEmpty())
        {
            int size= queue.size();
            level++;
            for(int i=0;i<size;i++)
            {
                TreeNode curr= queue.poll();
                if(curr!=null &&curr.left!=null)
                {
                    queue.add(curr.left);
                }
                if(curr!=null &&curr.right!=null)
                {
                    queue.add(curr.right);
                }
                if (curr!=null &&curr.left==null && curr.right==null)
                {
                    depth=Math.min(depth,level);

                }
            }
        }
        return depth;
    }



    public static void main(String[] args) {



    }
}
