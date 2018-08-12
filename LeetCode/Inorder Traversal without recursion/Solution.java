/**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode(int x) { val = x; }
* }
*/


public class Solution{

  public ArrayList<Integer> inorderTraversal(TreeNode root){
    ArrayList<Integer> res = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();

    if(root != null){
      pushLeftNodesToStack(root, stack);
    }

    while(!stack.isEmpty()){
      TreeNode curr = stack.pop();
      int currVal = curr.val;
      res.add(currVal);
      if(curr.right != null){
        pushAllLeftNodes(root.right);
      }
    }
    return res;
  }

  public void pushLeftNodesToStack(TreeNode root, Stack<Integer> stack){
    while(root != null){
      stack.push(root);
      root = root.left;
    }
  }

}
