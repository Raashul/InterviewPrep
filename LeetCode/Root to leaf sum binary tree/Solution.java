
// The above code is a simple preorder traversal code which visits every exactly once. 
// Therefore, the time complexity is O(n) where n is the number of nodes in the given binary tree.


public class Solution{

	public boolean sum(TreeNode root, int target, List<Integer> result){
		if(root == null){
			return false;
		}

		//check if the node is the leaf node
		if(root.left == null && root.right == null){
			if(root.data == target){
				result.add(root);
				return true;
			}
			else{
				return false;
			}
		}


		if(sum(root.left, target-root.data, result)){
			result.add(root);
			return true;
		}

		if(sum(root.right, target-root.right, result)){
			result.add(root);
			return true;
		}
		return false;
	}
}

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
  public int sumNumbers(TreeNode root) {
    return helper(root, 0);
  }
  public int helper(TreeNode root, int total){
    if(root == null) return 0;
    
    total = total * 10 + root.val;
    
    if(root.left == null && root.right == null){
      return total;
    }
    
    return helper(root.left, total) + helper(root.right, total);
    
  }
}
