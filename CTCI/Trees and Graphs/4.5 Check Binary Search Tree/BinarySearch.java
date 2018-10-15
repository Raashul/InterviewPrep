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
    binaryTree.root = new Node(20);
    binaryTree.root.left = new Node(15);
    binaryTree.root.right = new Node(25);
    binaryTree.root.left.left = new Node(10);
    binaryTree.root.left.right = new Node(17);
    binaryTree.root.right.left = new Node(22);
    binaryTree.root.right.left.left = new Node(21);

    System.out.println(binaryTree.checkBinaryTree(binaryTree.root));
  }

  boolean checkBinaryTree(Node root){
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;

    return checkBinaryTree(root, max, min);
  }

  boolean checkBinaryTree(Node root, int max, int min){
    if(root == null) return true;
    if(root.data > max || root.data < min) return false;

    return checkBinaryTree(root.left, root.data, min) && checkBinaryTree(root.right, max, root.data);

  }



}
