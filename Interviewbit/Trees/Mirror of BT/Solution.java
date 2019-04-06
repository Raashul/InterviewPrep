import java.util.*;

class TreeNode{
  int data;
  TreeNode left, right;
  TreeNode(int d){
    this.data = d;
    left = right = null;
  }
}

class Main{
  TreeNode root;
  public static void main(String[] args){
    Main tree = new Main();
    tree.root = new TreeNode(1);
    tree.root.left = new TreeNode(2);
     tree.root.left.left = new TreeNode(4);
      tree.root.left.right = new TreeNode(5);
    tree.root.right= new TreeNode(3);

    tree.mirrorBT();
    tree.levelOrder(tree.root);

  }

  public void levelOrder(TreeNode node){
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(node);

    while(queue.size() > 0){
      TreeNode curr = queue.remove();
      System.out.println(curr.data);
      if(curr.left != null){
        queue.add(curr.left);
      }
      if(curr.right != null){
        queue.add(curr.right);
      }
    }
  }

  public void mirrorBT(){
    if(root != null){
      TreeNode n = mirrorBT(root);
    }
  }

  public TreeNode mirrorBT(TreeNode node){
    if(node == null) return null;

    TreeNode left = mirrorBT(node.left);
    TreeNode right = mirrorBT(node.right);

    node.left = right;
    node.right = left;

    return node;
  }

}