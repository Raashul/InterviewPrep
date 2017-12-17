public class Solution{
	public int FindBottomLeftNodeVal(TreeNode node){
		if(node == null)
			return null;
		Queue<TreeNode> q = new Queue<TreeNode>();
		q.add(node);

		while(!q.isEmpty()){
			TreeNode currentNode = q.poll();
			if(currentNode.right != null){
				q.add(currentNode.right);
			}
			if(currentNode.left != null){
				q.add(currentNode.left);
			}
		}
		return currentNode.val;
	}
}


					