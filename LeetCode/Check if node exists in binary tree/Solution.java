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
  public static void main(String[] args) {
    Main binaryTree = new Main();
    binaryTree.root = new Node(1);
    binaryTree.root.left = new Node(2);
    binaryTree.root.right = new Node(3);
    binaryTree.root.left.left = new Node(4);
    binaryTree.root.left.right = new Node(5);
    binaryTree.root.right.left = new Node(6);
    binaryTree.root.right.left.left = new Node(7);

    System.out.println(binaryTree.checkNode(binaryTree.root, new Node(10)));

  }


  boolean checkNode(Node root, Node target){
    if(root == null || target == null) return false;
    LinkedList<Node> queue = new LinkedList<Node>();
    queue.add(root);

    while(!queue.isEmpty()){
      Node curr = queue.remove();
      if(curr.data == target.data) return true;
      if(curr.left != null) queue.add(curr.left);
      if(curr.right != null) queue.add(curr.right);
    }

    return false;
  }
}
