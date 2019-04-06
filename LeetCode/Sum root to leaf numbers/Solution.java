

/**

Given a binary tree containing digits from 0-9 only, each root-to-leaf path could
represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.


* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode(int x) { val = x; }
* }
*/

// he above code is a simple preorder traversal code which visits every exactly once. 
// Therefore, the time complexity is O(n) where n is the number of nodes in the given binary tree.

//Iterative method
class Solution {
  int sum= 0;
  public int sumNumbers(TreeNode root) {
    if(root == null){
      return 0;
    }
    Queue<TreeNode> queue = new Queue<TreeNode>();
    queue.add(root);

    while(!queue.isEmpty()){
      TreeNode temp = queue.poll();
      int tempVal = temp.val;

      if(temp.left == null && temp.right == null){
        sum += tempVal;
      }

      if(temp.left != null){
        int curr = tempVal * 10 + temp.left.val;
        temp.left.val = curr;
        queue.add(temp.left);
      }

      if(temp.right != null){
        int curr = tempVal * 10 + temp.right.val;
        temp.right.val = curr;
        queue.add(temp.right);
      }

    }

    return sum;
  }
}


//Recursive approach

import java.util.*;

class Node{
  int data;
  Node left, right;

  Node(int val){
    data = val;
    left = right = null;
  }
}

class Solution{

  Node root;

  int sumToLeaf(Node root){
    return sumToLeaf(root, 0);
  }

  int sumToLeaf(Node root, int sum){

    if(root == null){
      return 0;
    }
    sum = sum * 10 + root.data;
`
    if(root.left == null && root.right == null){
      return sum;
    }
    return sumToLeaf(root.left, sum) + sumToLeaf(root.right, sum);
  }


  public static void main(String[] args){
    Solution tree = new Solution();
    tree.root = new Node(4);
    tree.root.left = new Node(9);
    tree.root.right= new Node(0);
    tree.root.left.left = new Node(5);
    tree.root.left.right = new Node(1);

    System.out.println(tree.sumToLeaf(tree.root));

  }
}


/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
        private int  sumN;

    public int sumNumbers(TreeNode A) {
        sumN = 0;
        sumHelper(A, 0);
        return sumN;
    }
    
    public void sumHelper(TreeNode root, int currentSum){
        if(root == null)return;
        currentSum = (currentSum*10 + root.val) % 1003;
        if(root.left == null && root.right == null)
        {
            sumN += currentSum;
            sumN %=  1003;
            return;
        }

        sumHelper(root.left, currentSum);
        sumHelper(root.right, currentSum);
    }
}



