import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {

    public static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }


    public static List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null) return result;

        Stack<TreeNode> stack=new Stack<>();

        TreeNode curr=root;
        stack.push(curr);

        while(!stack.isEmpty() )
        {
            curr=stack.peek();
            result.add(curr.val);
            curr=stack.pop();
            if(curr.right!=null) {
                stack.push(curr.right);
            }
            if(curr.left!=null) {
                stack.push(curr.left);
            }
        }
        return result;


    }

    public static List<Integer> preorderTraversalRecursion(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null) return result;
        result.add(root.val);
        result.addAll(preorderTraversalRecursion(root.left));
        result.addAll(preorderTraversalRecursion(root.right));
        return result;



    }

    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(5);
        preorderTraversal(root);





    }
}
