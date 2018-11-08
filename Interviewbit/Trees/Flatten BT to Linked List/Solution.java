/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    TreeNode prev = null;
    public TreeNode flatten(TreeNode a) {
        TreeNode head = helper(a, prev);
        return head;
    }
    
    public TreeNode helper(TreeNode node, TreeNode prev){
        if(node == null) return prev;
        
        prev = helper(node.right, prev);
        prev = helper(node.left, prev);
        node.right = prev;
        node.left = null;
        return node;
        
    }
}
