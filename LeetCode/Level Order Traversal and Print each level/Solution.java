import java.io.*;
import java.util.*;


class Node{
  int data;
  Node left;
  Node right;

  public Node(int data){
    this.data = data;
    this.left = null;
    this.right = null;
  }
}


public class Solution {

  public static void main(String[] args){
    Node root = new Node(5);
    root.left = new Node(10);
    root.right = new Node(15);
    root.left.left = new Node(20);
    root.left.right = new Node(25);
    root.right.left = new Node(30);
    root.right.right = new Node(35);

    levelOrderByQueue(root);
  }

  public static void levelOrderByQueue(Node root){
    Queue<Node> q = new LinkedList<Node>();
    int levelNodes = 0;
    if(root == null) return;
    q.add(root);
    while(!q.isEmpty()){
      levelNodes = q.size();
      while(levelNodes > 0){
        Node n = q.remove();
        System.out.print(" " + n.data);
        if(n.left != null) q.add(n.left);
        if(n.right != null) q.add(n.right);
        levelNodes--;
      }
      System.out.println();
    }
  }



}
