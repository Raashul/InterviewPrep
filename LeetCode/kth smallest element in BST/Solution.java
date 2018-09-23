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
  int count = 0;
  int res = Integer.MAX_VALUE;

  public int kthSmallest(TreeNode root, int k) {
    helper(root, k);
    return res;
  }

  public void helper(TreeNode root, int k){
    // if(root == null) return;
    // helper(root.left, k);
    // count++;
    // if(count == k) res = root.val;
    // helper(root.right, k);

    if(root != null){
      if(root.left != null){
        helper(root.left, k);
      }
      count++;
      if(count == k) res = root.val;
      if(root.right != null){
         helper(root.right, k);
      }

    }

  }
}
