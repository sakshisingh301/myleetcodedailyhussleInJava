//import java.util.Hash;
//import java.util.LinkedList;
//import java.util.List;
//
//public class Find_Duplicate_Subtree {
//
//
//
//      public class TreeNode {
//          int val;
//         TreeNode left;
//          TreeNode right;
//          TreeNode() {}
//          TreeNode(int val) { this.val = val; }
//          TreeNode(int val, TreeNode left, TreeNode right) {
//              this.val = val;
//             this.left = left;
//              this.right = right;
//         }
//      }
//
//
//    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
//
//          List<TreeNode> res=new LinkedList<>();
//          tranverse(root, new Hash<>(),res);
//          return res;
//
//    }
//
//    private String tranverse(TreeNode root, Hash<String, Integer> , List<TreeNode> res) {
//          if (root==null)
//              return"";
//          String representation="("+tranverse(root.left,,res)+')'+'('+tranverse(root.right,map,res)+')';
//          map.put(representation,map.getOrDefault(representation,0)+1);
//          if(map.get(representation)==2)
//          {
//              res.add(root);
//          }
//          return representation;
//    }
//
//
//
//
//}
