/*
	
	public static class Result{
		public TreeNode node;
		public boolean isAncestor;
		public Result(TreeNode n, boolean isAnc){
			node = n;
			isAncestor = isAnc;
		}
	}

*/

public class Solution{	
	TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q){
		Result r = commonAncestorHelper(root, p, q);
		if(r.isAncestor){
			return r.node;
		}
		return null;
	}

	Result commonAncestorHelper(TreeNode root, TreeNode p, TreeNode q){
		if(root == null){
			return new Result(null, false);
		}
		if(root == p || root == q){
			return new Result(root, true);
		}
		Result rx = commonAncestorHelper(root.left, p, q){
			if(rx.isAncestor)
				return rx;
		}
		Result ry = commonAncestorHelper(root.right, p, q);
		if(ry.isAncestor)
			return ry;

		if(rx.node != null && ry.node != null){
			return new Result(root, true);
		}
		else if(root == p || root == q){
			if(rx.node != null || ry.node != null){
				boolean isAncestor = true;
			}
			else{
				boolean isAncestor = false;
			}
			return new Result(root, isAncestor);
		}

	}

}


