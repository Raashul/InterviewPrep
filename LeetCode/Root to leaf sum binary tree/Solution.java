public class Solution{

	public boolean sum(TreeNode root, int target, List<Integer>){
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
