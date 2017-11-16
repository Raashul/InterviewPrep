// Given a non-empty binary search tree and a target value,
//find the value in the BST that is closest to the target.

// Note:
	// Given target value is a floating point.
	// You are guaranteed to have only one unique value in the BST that
//is closest to the target.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public int closestBinaryTreeValue(TreeNode root, TreeNode target){
  int value = root.val;
  TreeNode child = value > target ? root.left : root.right;

  if(child == null)
    return value;

  int childValue = closestBinaryTreeValue(child, target);

  return Math.abs(childValue-target) < Math.abs(value-target) ? childValue : value;

}
