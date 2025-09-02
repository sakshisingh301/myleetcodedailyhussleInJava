public class BalancedBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            right = null;
            left = null;
        }
    }

    public static int height(TreeNode root)
    {
        if(root==null) return 0;
        int left=height(root.left);
        int right=height(root.right);
        return 1+Math.max(left,right);
    }


    public boolean isBalanced(TreeNode root) {

        //base case
        if(root==null) return true;

        //Hypothesis
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);


        //induction
        if(Math.abs(leftHeight-rightHeight)<=1 && isBalanced(root.left) && isBalanced(root.right))
        {
            return true;
        }
        return false;

    }
}
