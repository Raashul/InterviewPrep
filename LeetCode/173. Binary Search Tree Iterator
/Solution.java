/*
mplement an iterator over a binary search tree (BST). Your iterator will be 
initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, 
where h is the height of the tree.

*/

public class Solution{
	Stack<TreeNode> st = new Stack<Integer>();


	public Solution(TreeNode root){
		AllLeftNodes(root.left);
	}

	public int next(){
		int current = st.pop();
		AllLeftNodes(current.left);
		return current.val;
	}


	public void AllLeftNodes(TreeNode node){
		TreeNode current = node;

		while(current != null){
			st.push(current);
			current = current.left;
		}
	}
}