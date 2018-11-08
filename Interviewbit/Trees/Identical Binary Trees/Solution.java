public class Solution{
  //recursive
  public boolean isIdentical(TreeNode a, TreeNode b){
    if(a == null && b == null) return true;
    if(a.val != b.val) return false;

    if(a == null || b == null) return false;

    return isIdential(a.left, b.left) || isIdential(a.right, b.right);

  }
}

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
    public int isSameTree(TreeNode A, TreeNode B) {
       LinkedList<TreeNode> queue = new LinkedList<>();
       
       if(A == null && B == null) return 1;
       if(A == null || B == null) return 0;
       
       queue.add(A);
       queue.add(B);
       
       while(queue.size() > 0){
           TreeNode left = queue.remove();
           TreeNode right = queue.remove();
           
           if(left == null && right == null) continue;
           
           if(left == null || right == null) return 0;
           
           if(left.val != right.val) return 0;
           
           queue.add(left.left);
           queue.add(right.left);
           queue.add(left.right);
           queue.add(right.right);
           
       }
       
       return 1;
       
    }
}
