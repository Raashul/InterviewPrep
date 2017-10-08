/*
Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the
 original BST is changed to the original key plus sum of all keys greater than the original 
 key in BST.
*/


 public class Solution{

 	public TreeNode ConvertBSTtoGreat(TreeNode root){
 		int currentTotal = 0;

 		postOrder(root.right);
 	}

 	public void PostOrder(TreeNode node){
 		if(node == null) return;

 		PostOrder(root.right);

 		node.val += currentTotal;
 		currentTotal += node.val;

 		PostOrder(root.left);
 	}

 }