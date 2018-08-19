public class Solution{

	TreeNode lowestAnc(TreeNode root, TreeNode p, TreeNode q){
		if(root == null){
			return null;
		}
		if(root > max(p.data, q.data)){
			return lowestAnc(root.left, p, q);
		}
		else if(root < min(p.data, q.data)){
			return lowestAnc(root.right, p, q);
		}
		else{
			return root;
		}
	}

}
