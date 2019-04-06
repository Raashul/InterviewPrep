public class Solution{
  public TreeNode inorderSuccessor(TreeNode root, TreeNode target){
    if(root == null) return null;
    TreeNode next = null;
    
    while(root != null && root.val != target){
      if(root.val > target.val){
        next = root;
        root = root.left;
      } else {
        root = root.right;
      }
    }

    if(root == null) return null;

    if(root.val == target.val){
      if(root.right == null){
        return next;
      } else {
        root = root.right;
      }
    }
    while(root.left != null){
      root = root.left;
    }
    return root;
  }
}