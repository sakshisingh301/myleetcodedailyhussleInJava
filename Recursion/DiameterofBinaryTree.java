public class DiameterofBinaryTree {

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
    private int diameter=0;

    public int height(TreeNode root)
    {
        if(root==null) return 0;
        int left=height(root.left);
        int right=height(root.right);
        diameter=Math.max(diameter,left+right);
        return 1+Math.max(left,right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;

    }
}
