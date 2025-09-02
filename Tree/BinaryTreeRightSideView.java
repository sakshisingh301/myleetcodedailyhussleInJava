import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public List<Integer> rightViewRecursion(TreeNode root)
    {
        List<Integer> res=new ArrayList<>();
        helper(root,0,res);
        return res;
    }

    private void helper(TreeNode root, int level,List<Integer> res) {
        //Base Condition
        if(root==null) return;
        //Induction
        if(level==res.size())
        {
            res.add(root.val);
        }
        helper(root.left,level+1,res);
        helper(root.right, level+1,res);
    }


    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            int queueSize= queue.size();
            for(int i=0;i<queueSize;i++)
            {
                TreeNode curr=queue.poll();

                if(curr!=null && i==queueSize-1)
                {
                    res.add(curr.val);
                }
                if(curr!=null && curr.left!=null)
                {
                    queue.add(curr.left);
                }
                if(curr!=null && curr.right!=null)
                {
                    queue.add(curr.right);
                }

            }
        }
        return res;

    }
}
