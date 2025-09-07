import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {
    public static class TreeNode {
        int val;
       TreeNode right;
        TreeNode left;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public String preorderTraversal(TreeNode root) {

        if (root == null) return "null,";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(root.val).append(",");
        stringBuilder.append(preorderTraversal(root.left));
        stringBuilder.append(preorderTraversal(root.right));
        return stringBuilder.toString();

    }
    public String serialize(TreeNode root) {


        return preorderTraversal(root);


    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String [] nodes=data.split(",");
        Queue<String> queue=new LinkedList<>(Arrays.asList(nodes));
        return constructTree(queue);

    }

    private TreeNode constructTree(Queue<String> queue) {
        String val= queue.poll();
        if(val.equals("null"))
        {
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(val));
        root.left=constructTree(queue);
        root.right=constructTree(queue);
        return root;
    }

    //postorder method
}
