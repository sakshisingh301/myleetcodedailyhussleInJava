public class MaximumDepthOfTheTree {
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

    //Hypothesis, induction, Base Condition

    public int maxDepth(TreeNode root) {

        //Base Condition
        if(root==null) return 0;
        //Induction
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return (1+Math.max(left,right));

        //Hypothesis(calling on smaller input)
        //int left= maxDepth(root.left)


    }


}
