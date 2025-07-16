import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {

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

    public List<Integer> preorderTraversal(TreeNode root) {

        if(root==null) return null;
        Stack<TreeNode> stack=new Stack<>();
        ArrayList<Integer> result=new ArrayList<>();



    }

    public static void main(String[] args) {



    }
}
