public class Solution{

	//recursive method

	/*
	
	Since each node in the tree is visited only once, the time complexity is O(n),
	 where nn is the number of nodes in the tree. We cannot do better than that, since at the very
	 least we have to visit each node to invert it.
	Because of recursion, O(h) function calls will be placed on the stack in the worst case,
	 where h is the height of the tree. Because h ∈ O(n), the space complexity is O(n)

	*/

	class Solution {
  public TreeNode invertTree(TreeNode root) {
    if(root == null)
      return null;
    TreeNode left = invertTree(root.left);
    TreeNode right = invertTree(root.right);

    root.left = right;
    root.right = left;
    return root;
  }
}


	public TreeNode invertBinaryTree(TreeNode root){
		if(root == null)
			return root;

		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		while(queue.size() > 0){
			TreeNode node = queue.removeFirst();

			while(node.left != null || node.right != null){
				TreeNode temp = node.left;
				node.left = node.right;
				node.right = temp;

				if(node.left != null){
					queue.add(node.left);
				}
				if(node.right != null){
					queue.add(node.right);
				}
			}
		}

	}

}
