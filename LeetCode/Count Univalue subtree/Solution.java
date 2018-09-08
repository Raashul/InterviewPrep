
import java.util.*;


class Node{
  Node left, right;
  int data;
  Node(int value){
    data = value;
    left = right = null;
  }
}

class Count{
  int count = 0;
}

class Solution{

  Node root;


  int countUnival(Node root){
    Count c = new Count();
    helper(root, c);
    return c.count;
  }

  boolean helper(Node root, Count c){
    if(root == null) return true;

    boolean left = helper(root.left, c);
    boolean right = helper(root.right, c);

    if(left == false || right == false) return false;

    if(root.left != null && root.left.data != root.data)
      return false;

    if(root.right != null && root.right.data != root.data)
      return false;

    c.count++;
    return true;

  }

  public static void main(String[] args){
    Solution tree = new Solution();
    tree.root = new Node(5);
    tree.root.left = new Node(4);
    tree.root.right = new Node(5);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(4);
    tree.root.right.right = new Node(5);

    System.out.println(tree.countUnival(tree.root));
  }
}
