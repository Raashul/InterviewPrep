public class Solution{

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