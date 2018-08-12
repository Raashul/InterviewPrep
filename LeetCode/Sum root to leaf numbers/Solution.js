

/**

Given a binary tree containing digits from 0-9 only, each root-to-leaf path could
represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.


* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode(int x) { val = x; }
* }
*/

//Iterative method
class Solution {
  int sum= 0;
  public int sumNumbers(TreeNode root) {
    if(root == null){
      return 0;
    }
    Queue<TreeNode> queue = new Queue<TreeNode>();
    queue.add(root);

    while(!queue.isEmpty()){
      TreeNode temp = queue.poll();
      int tempVal = temp.val;

      if(temp.left == null && temp.right == null){
        sum += tempVal;
      }

      if(temp.left != null){
        int curr = tempVal * 10 + temp.left.val;
        temp.left.val = curr;
        queue.add(temp.left);
      }

      if(temp.right != null){
        int curr = tempVal * 10 + temp.right.val;
        temp.right.val = curr;
        queue.add(temp.right);
      }

    }

    return sum;
  }
}


//Recursive approach

class Solution {
  int sum= 0;

  public int sumPath(TreeNode root){
    return sumPath(root, 0);
  }

  public int sumPath(TreeNode node, int sum){
    if(node == null){
      return 0;
    }
    if(node.left == null && node.right == null){
      sum += sum * 10 + node.val;
    }
    return sumPath(root.left, sum * 10+ root.val) + sumPath(root.right, sum * 10+ root.val)
  }

}
