public class LowestCommonAncessestor {

    static class TreeNode{
        int val;
        TreeNode right,left;
        public TreeNode(int val)
        {
            this.val=val;
            right=left=null;
        }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        //base condition
        if(root==null) return null;
        if(root==p ||root==q) return root;
        //induction
        //hypothesis
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null)
        {
            return root;
        }
        else if(left==null && right!=null)
        {
            return right;
        }
        else {
            return left;
        }


    }


    public static void main(String[] args) {

    }
}
