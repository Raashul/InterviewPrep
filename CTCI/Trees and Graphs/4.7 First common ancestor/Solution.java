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
	TreeNode commonAncester(TreeNode root, TreeNode p, TreeNode q){
		
		Result r = commonAncesterHelper(root, p, q);
		if(r.isAncestor){
			return r.node;
		}
		return null;
	}
	TreeNode commonAncesterHelper(TreeNode root, TreeNode p, TreeNode q){
		if(root == null) return null;

		if(root == p && root == q) {
			return new Result(root, true);
		}

		Result rx = commonAncesterHelper(root.left, p, q);
		if(rx.isAncestor){
			return rx;
		}
		Result ry = commonAncesterHelper(root.right, p, q);
		if(ry.isAncestor){
			return ry;
		}

		if(rx.node != null || ry.node != null){
			return new Result(root, true);
		}
		else if(root == p || root == q){
			boolean isAncestor;
			if(rx.node != null || ry.node != null){
				isAncestor = true;
			}
			else{
				isAncestor = false;
			}
			return new Result(root, isAncestor);
		}
		else{
			return new Result(rx.node != null ? rx.node : ry.node, false);
		}
	}
}


