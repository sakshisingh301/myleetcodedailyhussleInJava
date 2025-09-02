import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

    public static class TreeNode {
        int val;
       TreeNode right;
        TreeNode left;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public TreeNode invertTree(TreeNode root) {

        if(root==null) return null;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            TreeNode curr=queue.poll();
            TreeNode temp=curr.left;
            curr.left=curr.right;
            curr.right=temp;
            if(curr.left!=null) queue.add(curr.left);
            if(curr.right!=null) queue.add(curr.right);
        }
        return root;

    }
    public static void main(String[] args) {

    }
}
