public class Solution{

	public boolean isSubTree(TreeNode root1, TreeNode root2){

		if(root1 == null)
			return true;
		if(root2 == null)
			return false;

		if(isIdentical(root1, root2)){
			return true;
		}

		return isSubTree(root1.left, root2) || isSubTree(root1.right, root2);
	}

	public boolean isIdentical(TreeNode root1, TreeNode root2){
		if(root1 == null && root2 == null)
			return true;

		if(root1 == null || root2 == null)
			return false;

		return (root1.data == root2.data) && isIdentical(root1.left, root2.left) &&
			isIdentical(root1.right, root2.right);
	}

}