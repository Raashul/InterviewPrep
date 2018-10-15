/**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode(int x) { val = x; }
* }
*/
class Solution {
  public int findBottomLeftValue(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    if(root == null)
      return -1;
    queue.add(root);

    while(!queue.isEmpty()){
      root = queue.poll();
      if(root.right != null){
        queue.add(root.right);
      }
      if(root.left != null){
        queue.add(root.left);
      }
    }
    return root.val;
  }
}


//recursive Solution

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	int level = 1, maxLevel = Integer.MIN_VALUE;
	int res = -1;

  public int findBottomLeftValue(TreeNode root) {
		helper(root, level);
		return res;
  }

	public void helper(TreeNode root, int level){
		if(root == null)
			return;
		//leaf node with highest level
		if((root.left == null) && (root.right == null) && (level > maxLevel)){
			maxLevel = level;
			res = root.val;
		}

		helper(root.left, level +1);
		helper(root.right, level + 1);


	}

}


import java.util.*;
class Node{
  int data;
  Node left;
  Node right;
  Node(int data){
    this.data= data;
    left = right = null;
  }
}

class Main {
  Node root;

  int res = -1;
  int maxLevel = Integer.MIN_VALUE;

  public static void main(String[] args) {
    Main binaryTree = new Main();
    binaryTree.root = new Node(20);
    binaryTree.root.left = new Node(15);
    binaryTree.root.right = new Node(25);
    binaryTree.root.left.left = new Node(10);
    binaryTree.root.left.right = new Node(17);
    binaryTree.root.right.left = new Node(22);
    binaryTree.root.right.left.left = new Node(21);
    binaryTree.root.right.left.left.right = new Node(1);

    System.out.println(binaryTree.findBottomLeftTree(binaryTree.root));
  }

  int findBottomLeftTree(Node root){
    if(root == null) return -1;
    int level = 1;
    helper(root, level);
    return res;
  }

  void helper(Node root, int level){
    if(root == null) return;
    if(root.left == null && root.right == null && level > maxLevel){
      level = maxLevel;
      res = root.data;
    }
    helper(root.left, level+1);
    helper(root.right, level+1);
  }

}
