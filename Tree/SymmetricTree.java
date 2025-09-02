import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val)
        {
            this.val=val;
            right=null;
            left=null;
        }
    }

    public static boolean isSymmetric(TreeNode root) {

        if(root==null) return true;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty())
        {
            TreeNode curr1=queue.poll();
            TreeNode curr2=queue.poll();
            if(curr1==null && curr2==null) continue;

            if(curr1==null || curr2==null) return false;

            if(curr1.val != curr2.val) return false;

            queue.add((curr1.left!=null)?curr1.left:null);
            queue.add((curr2.right!=null)?curr2.right:null);
            queue.add((curr1.right!=null) ? curr1.right:null);
            queue.add((curr2.left!=null)? curr2.left:null);
        }
        return true;



    }


    public static void main(String[] args) {

    }
}
