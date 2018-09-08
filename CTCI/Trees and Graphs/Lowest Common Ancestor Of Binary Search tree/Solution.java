class Node{

  Node left;
  Node right;
  int data;
  Node(int val){
    data = val;
    left = null;
    right = null;
  }
}

class Solution{

  Node root;

  public static void main(String[] args){
    Solution tree = new Solution();
    tree.root = new Node(6);
    tree.root.left = new Node(2);
    tree.root.right = new Node(8);
    tree.root.left.left = new Node(0);
    tree.root.left.right = new Node(4);
    tree.root.right.left = new Node(7);
    tree.root.right.right = new Node(9);
    tree.root.left.right.left = new Node(3);
    tree.root.left.right.right = new Node(5);

    System.out.println(tree.findLowestCommonAncestor(tree.root, tree.root.left, tree.root.left.right));
  }

  public int findLowestCommonAncestor(Node root, Node p, Node q){

    if(root == null) return -1;

    if(root.data > Math.max(p.data, q.data))
      return findLowestCommonAncestor(root.left, p, q);

    if(root.data < Math.min(p.data, q.data))
      return findLowestCommonAncestor(root.right, p, q);

    return root.data;
  }


}
