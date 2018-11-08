/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int hasPathSum(TreeNode A, int B) {
        //check if curr node is leaf
        // if it is check the sum until that point

        if(A == null ) return 0;
        return helper(A, B);


    }

    public int helper(TreeNode root, int target){
        if(root == null) return 0;

        if(isLeafNode(root)){
            if(target == root.val) return 1;
            return 0;
        }
        return Math.max(helper(root.left, target-root.val), helper(root.right, target-root.val));
    }

    public boolean isLeafNode(TreeNode node){
        if(node.left == null && node.right == null) return true;
        return false;
    }
}
