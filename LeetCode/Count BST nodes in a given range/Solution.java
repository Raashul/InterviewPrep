public class Solution{
  public int countBSTnode(TreeNode root, int start, int end){
    if(root == null){
      return 0;
    }

    if(root.data >= start && root.data <= end){
      return 1 + countBSTnode(root.left, start, end) + countBSTnode(root.right, start,end);
    }
    else if(root.data < low){
      return countBSTnode(root.right, start, end);
    }
    else{
      return countBSTnode(root.left, start, end);
    }
  }
}

//Time complexity of the above program is O(h + k) where h is height of BST and k is number of nodes in given range.