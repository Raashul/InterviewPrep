/*
Time complexity : O(n)O(n). The time complexity is O(n)
 because the recursive function is T(n) = 2 . T(n/2)+1

Space complexity : The worst case space required is O(n)
and in the average case it'sO(log(n)) where n is number of nodes.

*/

class Solution {
  public List < Integer > inorderTraversal(TreeNode root) {
    List < Integer > res = new ArrayList < > ();
    helper(root, res);
    return res;
  }

  public void helper(TreeNode root, List < Integer > res) {
    if(root != null){
      if(root.left != null){
        helper(root.left, res);
      }
      res.add(root.val);
      if(root.right != null){
        helper(root.right, res);
      }
    }
  }
}
