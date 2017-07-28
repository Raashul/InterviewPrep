/*
	The min/max approach
	Check if root falls inside the range Integer.MIN - Integer.MAX
	Update the min/max value as your progress into the tree

																	20    min = Integer.MIN, max=Integer.MAX
																	/  \
		min = Integer.MIN,max= 20 <-10    30 
																/    		\
															5    			15  -> min=30, max=Integer.MAX
														/  \     			\
													3     7     		17			  

*/

public class BinarySearch{
	boolean checkBST(TreeNode root){
		checkBST(root, Integer.MIN, Integer.MAX);
	}

	boolean checkBST(TreeNode root, min, max){
		if(root == null) return true;

		if(root.data > max || root.data < min)
			return false;

		/* Duplicated allowed */

		if(!checkBST(root.left, min, root.data) || !checkBST(root.right, root.data, max)){
			return false;
		}
		return true;


	}
}

