public class MinimumDepthofBinaryTree {

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

    public int minDepth(TreeNode root) {
        //Base Condition
        if(root==null) return 0;
        //Hypothesis
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        if(left==0 || right==0)
            return 1+Math.max(left,right);

        //Induction
        return 1+Math.min(left,right);

    }

    public static void main(String[] args) {

    }
}
