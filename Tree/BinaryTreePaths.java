import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> res=new ArrayList<>();
        preOrder(root,"",res);
        return res;

    }

    private void preOrder(TreeNode root,String path, List<String> res) {
        if(root==null) return;
        if(path.isEmpty())
        {
            path=""+root.val;
        }
        else {
            path=path+"->"+root.val;

        }

        if(root.left==null && root.right==null)
        {
            res.add(path);
        }
        preOrder(root.left,path,res);
        preOrder(root.right,path,res);


    }


}
