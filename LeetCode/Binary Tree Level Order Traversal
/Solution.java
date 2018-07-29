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
  public List<List<Integer>> levelOrder(TreeNode root) {


    List<List<Integer>> res = new ArrayList<List<Integer>>();
      if(root == null){
      return res;
    }
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);

    while(!queue.isEmpty()){
      List<Integer> temp = new ArrayList<Integer>();
      int level = queue.size();

      for(int i =0; i < level; i++){
        TreeNode curr = queue.poll();
        if(curr.left != null){
          queue.add(curr.left);
        }
        if(curr.right != null){
          queue.add(curr.right);
        }
        temp.add(curr.val);
      }
      res.add(temp);
    }
    return res;
  }
}




//Recursive Solution

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
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    return helper(root, res, 0);
  }

  public List<List<Integer>> helper(TreeNode root, List<List<Integer>> res, int level){
    if(root == null)
      return res;
    if(res.size() == level)
      res.add(new ArrayList<Integer>());

    res.get(level).add(root.val);

    helper(root.left, res, level +1);
    helper(root.right, res, level + 1)

  }
}
