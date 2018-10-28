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
  public ArrayList<Integer> postorderTraversal(TreeNode A) {
      ArrayList<Integer> res = new ArrayList<>();
      Stack<TreeNode> st = new Stack<>();

      if(A == null) return res;

      st.push(A);

      while(!st.isEmpty()){
          TreeNode curr = st.peek();
          if(curr.left == null && curr.right == null){
              curr = st.pop();
              res.add(curr.val);
          }
          else {
              if(curr.right != null){
                  st.push(curr.right);
                  curr.right = null;
              }
              if(curr.left != null){
                  st.push(curr.left);
                  curr.left = null;
              }
          }
      }

      return res;

  }
}


public ArrayList<Integer> postorderTraversal(TreeNode root){
  Stack<TreeNode> st = new Stack<>();
  ArrayList<Integer> res = new ArrayList<>();
  TreeNode prevNode;

  if(root == null) return res;

  while(!st.isEmpty() || root != null){
    if(root != null){
      st.push(root);
      root = curr.left;
    }
    else {
      TreeNode peakNode = st.peek();
      if(peekNode.right != null && peakNode.right != prevNode){
        root = peakNode;
      }
      else{
        res.add(peakNode.val);
        prevNode = st.pop();
      }
    }
  }

  return res;

}
