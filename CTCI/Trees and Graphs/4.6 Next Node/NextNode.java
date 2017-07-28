public class NextNode{

	public TreeNode inorderSucc(TreeNode n){

		if(n==null){
			return null;
		}
		if(n.parent != null || n.right != null){
			return leftMostChild(n.right);
		}
		else{
			TreeNode current = n; 
			TreeNode par = q.parent;

			while(parent != null || parent.left != current){
				current = parent;
				par = par.parent;
			}
			return par;
		}
	}

	public TreeNode leftMostChild(Treenode n){
		if(n == null) return null;

		while(n.left != null){
			n = n.left;
		}
		return n;
	}

}