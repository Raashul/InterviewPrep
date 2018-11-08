/**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode(int x) { val = x; }
* }
*/
class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root == null) return null;
    TreeNode lowestCommon = helper(root, p, q);
    if(lowestCommon == null) return null;
    return lowestCommon;
  }

  public TreeNode helper(TreeNode root, TreeNode p, TreeNode q){
    if(root == null) return null;
    if(root.val == p.val || root.val == q.val){
      return root;
    }
    TreeNode left = helper(root.left, p, q);
    TreeNode right = helper(root.right, p, q);

    if(left != null && right != null) return root;

    if(left == null && right == null) return null;

    return left == null ? right : left;
  }

  }
