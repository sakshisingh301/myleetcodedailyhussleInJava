import java.util.HashMap;

public class ConstructBinaryTreefromPreorderandInorderTraversal {

    public static class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int val)
        {
            this.val=val;
            right=left=null;

        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if(preorder.length!=inorder.length) return null;
        HashMap<Integer,Integer> inorderHashMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            inorderHashMap.put(inorder[i],i);
        }
        return buildTreeRecursive(inorder,0,inorder.length-1,preorder,0,preorder.length-1,inorderHashMap);

    }

    private TreeNode buildTreeRecursive(int[] inorder, int inorderStart, int inorderEnd, int[] preorder, int preorderStart, int preorderEnd, HashMap<Integer, Integer> inorderHashMap) {
        if(inorderStart>inorderEnd || preorderStart>preorderEnd) return null;
        TreeNode root=new TreeNode(preorder[preorderStart]);
        int rootIndex=inorderHashMap.get(preorder[preorderStart]);
        int numsLeft=rootIndex-inorderStart;

        root.left=buildTreeRecursive
                (inorder,inorderStart,rootIndex-1,preorder,preorderStart+1,preorderStart+numsLeft,inorderHashMap);
        root.right=buildTreeRecursive
                (inorder,rootIndex+1,inorderEnd,preorder,preorderStart + numsLeft + 1,preorderEnd,inorderHashMap);
        return root;
    }

    public static void main(String[] args) {

    }
}
