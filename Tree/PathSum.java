import java.util.Stack;

public class PathSum {

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

    public static class Node {
        TreeNode node;
        int sum;

        Node(TreeNode node, int sum) {
            this.node = node;
            this.sum = sum;
        }
    }


    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null && targetSum == 0) return true;
        if (root == null) return false;
        Stack<Node> stack = new Stack<>();
        stack.push(new Node(root, root.val));
        int prev = 0;
        TreeNode curr = root;

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            curr = current.node;
            prev = current.sum;

            if (curr.left == null && curr.right == null && prev == targetSum) return true;


            if (curr.right != null) {
                stack.push(new Node(curr.right,  prev + curr.right.val));


            }
            if (curr.left != null) {
                stack.push(new Node(curr.left,  prev + curr.left.val));


            }

        }
        return false;

    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(18);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        System.out.println(hasPathSum(root, 22));
    }
}