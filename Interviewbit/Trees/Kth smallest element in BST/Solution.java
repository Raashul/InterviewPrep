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
  LinkedList<TreeNode> st = new LinkedList<>();
  public int kthsmallest(TreeNode A, int B) {
    int count = 0;
    addAllLeftNodes(A);
    while(!st.isEmpty()){
      TreeNode curr = st.removeFirst();
      count++;
      if(count == B) return curr.val;
      if(curr.right != null){
        addAllLeftNodes(curr.right);
      }
    }
    return -1;
  }

  public void addAllLeftNodes(TreeNode root){
    while(root != null){
      st.addFirst(root);
      root = root.left;
    }
  }
}
