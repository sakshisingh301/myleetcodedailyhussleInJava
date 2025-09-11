import java.util.LinkedList;
import java.util.Queue;

public class CountGoodNodesinBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }

    }

    public class Pair{
        TreeNode node;
        int max_so_far;

        Pair(TreeNode node,int max_so_far)
        {
            this.node=node;
            this.max_so_far=max_so_far;
        }
    }

    public int goodNodes(TreeNode root) {
        if (root==null) return 0;
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(root, root.val));

        int good_nodes=0;

        while (!queue.isEmpty())
        {
            Pair pair=queue.poll();
            TreeNode curr=pair.node;
            int max_so_far=pair.max_so_far;
            if(curr.val>=max_so_far)
            {
                good_nodes++;
            }
            int newMaximum=Math.max(max_so_far, curr.val);
            if(curr.left!=null)
            {
                queue.add(new Pair(curr.left,newMaximum));
            }
            if(curr.right!=null)
            {
                queue.add(new Pair(curr.right,newMaximum));
            }

        }
        return good_nodes;

    }
}
