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
  public int findBottomLeftValue(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    if(root == null)
      return -1;
    queue.add(root);

    while(!queue.isEmpty()){
      root = queue.poll();
      if(root.right != null){
        queue.add(root.right);
      }
      if(root.left != null){
        queue.add(root.left);
      }
    }
    return root.val;
  }
}


//recursive Solution

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
	int level = 1, maxLevel = Integer.MIN_VALUE;
	int res = -1;

  public int findBottomLeftValue(TreeNode root) {
		helper(root, level);
		return res;
  }

	public void helper(TreeNode root, int level){
		if(root == null)
			return;
		//leaf node with highest level
		if((root.left == null) && (root.right == null) && (level > maxLevel)){
			maxLevel = level;
			res = root.val;
		}

		helper(root.left, level +1);
		helper(root.right, level + 1);


	}

}
