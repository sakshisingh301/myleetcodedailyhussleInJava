import java.util.HashMap;

public class ConstructBinaryTreefromInorderandPostorderTraversal {

  public static class TreeNode {
    int val;
    TreeNode right;
   TreeNode left;

    TreeNode(int val) {
      this.val = val;
      left = right = null;
    }
  }

  public TreeNode buildTree(int[] inorder, int[] postorder) {

    if(inorder.length!=postorder.length) return null;
    HashMap<Integer,Integer> inorderHashmap=new HashMap<>();

    for(int i=0;i<inorder.length;i++)
    {
      inorderHashmap.put(inorder[i],i);
    }
     return buildTreeRecursively(inorder,0,inorder.length-1,postorder,0,postorder.length-1,inorderHashmap);

  }

  private TreeNode buildTreeRecursively(int[] inorder, int inorderStart, int inorderEnd, int[] postorder, int postorderStart, int postorderEnd, HashMap<Integer, Integer> inorderHashmap) {
    //base condition
    if(inorderStart>inorderEnd ||postorderStart>postorderEnd) return null;
    //induction
    TreeNode root=new TreeNode(postorder[postorderEnd]);
    int rootIndex=inorderHashmap.get(postorder[postorderEnd]);
    int numsLeft=rootIndex-inorderStart;
    //hypothesis
    root.left=buildTreeRecursively
            (inorder,inorderStart,rootIndex-1,postorder,postorderStart,postorderStart+numsLeft-1,inorderHashmap);
    root.right=buildTreeRecursively
            (inorder,rootIndex+1,inorderEnd,postorder,postorderStart + numsLeft,postorderEnd-1,inorderHashmap);
    return root;

  }

  public static void main(String[] args) {

  }

}
