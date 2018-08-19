class Node{
  int data;
  Node left, right;
  Node(int d){
    data = d;
    left = right = null;
  }
}

class Solution{
  Node root;

  boolean checkBalanced(Node root){

    if(root == null){
      return true;
    }

    int leftHeight = calculateHeight(root.left);
    int rightHeight = calculateHeight(root.right);

    int heightDiff = Math.abs(leftHeight - rightHeight);

    if(heightDiff <= 1){
      checkBalanced(root.left);
      checkBalanced(root.right);
      return true;
    }
    return false;
  }

  int calculateHeight(Node root){

    if(root == null)
      return 0;

    return 1 + Math.max(calculateHeight(root.left), calculateHeight(root.right));

  }

  public static void main(String[] args){
    Solution tree = new Solution();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right =  new Node(3);
    tree.root.right.left = new Node(4);
    tree.root.right.right = new Node(5);

    System.out.println(tree.checkBalanced(tree.root));
  }

}


public class BalancedTree{

	public static int checkHeight(TreeNode root){
		if(root == null)
			return 0;

		//Check left height
		int leftHeight = checkHeight(root.left);
		if(leftHeight == -1)
			return -1;

		//Check right height
		int rightHeight = checkHeight(root.right);
		if(rightHeight == -1)
			return -1;

		int heightDiff = leftHeight - rightHeight;

		if(Math.abs(heightDiff) > 1){
			return -1; //not balanced
		}
		else{
			return Math.max(leftHeight, rightHeight) + 1;
		}

	}

	public static boolean isBalanced(TreeNode root){
		if(checkHeight(root) == -1)
			return false;
		else
			return true;
	}

}
