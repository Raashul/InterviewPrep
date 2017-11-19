public class NextNode{

	public TreeNode inorderSucc(TreeNode n){

		if(n==null){
			return null;
		}
		if(n.right != null){
			return leftMostChild(n.right);
		}
		else{
			TreeNode current = n;
			TreeNode par = n.parent;

			while(parent != null && parent.right == current){
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
