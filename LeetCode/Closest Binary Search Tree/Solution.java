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
    tree.root = new Node(20);
    tree.root.left = new Node(15);
    tree.root.right = new Node(25);
    tree.root.left.left = new Node(7);
    tree.root.left.right = new Node(18);
    tree.root.left.left.right = new Node(9);

    System.out.println(tree.closestBinarySearchVal(tree.root, 9));
  }

  public int closestBinarySearchVal(Node root, int target){

    int root_data = root.data;
    Node child = root.data > target ? root.left : root.right;

    if(child == null) return root_data;

    int childVal = closestBinarySearchVal(child, target);

    return Math.abs(target - childVal) > Math.abs(target - root_data) ? root_data : childVal;

  }

  //iterative

    public int closestBinarySearchVal(Node root, int target){
      int min = Math.MAX_VALUE;
      int diff = 0;
      int res = root.val;

      while(root != null){
        if(root.val < target){
          diff = Math.abs(root.val - target);
          if(diff < min){
            min = diff;
            res = root.val;
          }

          root = root.right;
        }
        else if(root.val > target){
          diff = Math.abs(root.val - target);
          if(diff < min){
            min = diff;
            res = root.val;
          }
          root = root.left;
        }
        else{
          return root.val;
        }
      }

      return res;
    }


}
