import java.util.*;

public class LowestCommonAncessestorII {
    static class TreeNode{
        int val;
        TreeNode right,left;
        public TreeNode(int val)
        {
            this.val=val;
            right=left=null;
        }
    }

    public class Inside{
        TreeNode node;
        List<TreeNode> paths;
        Inside(TreeNode node,List<TreeNode> paths)
        {
            this.node=node;
            this.paths=paths;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> p_path=new ArrayList<>();
        List<TreeNode> q_path=new ArrayList<>();
        Stack<Inside> stack=new Stack<>();
        stack.push(new Inside(root, Arrays.asList(root)));

        while(stack.isEmpty())
        {
            Inside curr=stack.pop();
            TreeNode currNode=curr.node;
            if(currNode==p)
            {
                p_path=curr.paths;
            }
            if(currNode==q)
            {
                q_path=curr.paths;
            }
            if(currNode.right!=null)
            {
                List<TreeNode> newPath=new ArrayList<>(curr.paths);
                newPath.add(currNode.right);
                stack.push(new Inside(currNode.right,newPath));

            }
            if(currNode.left!=null)
            {
                List<TreeNode> newPath=new ArrayList<>(curr.paths);
                newPath.add(currNode.left);
                stack.push(new Inside(currNode.left,newPath));
            }

        }
        if(p_path.isEmpty() ||q_path.isEmpty())
        {
            return null;
        }
        int i=0;
        TreeNode result=null;
        while(i<p_path.size() && i<q_path.size())
        {
            if(p_path.get(i)!=q_path.get(i))
            {
                break;
            }
            result=p_path.get(i);
            i++;
        }
        return result;



    }

    public static void main(String[] args) {

    }
}
