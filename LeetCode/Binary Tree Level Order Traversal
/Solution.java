/**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode(int x) { val = x; }
* }
*/
import java.util.*;

class Node{
  int val;
  Node left;
  Node right;
  Node(int data){
    val = data;
    left = right = null;
  }
}

class Main {
  Node root;
  public static void main(String[] args) {
    Main tree = new Main();
    tree.root = new Node(3);
    tree.root.left = new Node(9);
    tree.root.right = new Node(20);
    tree.root.right.left = new Node(15);
    tree.root.right.right = new Node(7);
    System.out.println(tree.binaryLevelOrder(tree.root));
  }

  public ArrayList<ArrayList<Integer>> binaryLevelOrder(Node root){
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    LinkedList<Node> queue = new LinkedList<Node>();

    if(root == null) return res;

    queue.add(root);

    while(!queue.isEmpty()){
      ArrayList<Integer> temp = new ArrayList<>();
      int level = queue.size();
      for(int i =0; i <level; i++){
        Node curr = queue.remove();
        if(curr.left != null){
          queue.add(curr.left);
        }
        if(curr.right != null){
          queue.add(curr.right);
        }
        temp.add(curr.val);
      }
      res.add(temp);
    }

    return res;
  }


}




//Recursive Solution

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
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    return helper(root, res, 0);
  }

  public List<List<Integer>> helper(TreeNode root, List<List<Integer>> res, int level){
    if(root == null)
      return res;
    if(res.size() == level)
      res.add(new ArrayList<Integer>());

    res.get(level).add(root.val);

    helper(root.left, res, level +1);
    helper(root.right, res, level + 1)

  }
}
