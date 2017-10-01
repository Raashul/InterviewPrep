/*
  Complexity Analysis

Because we traverse the entire input tree once, the total run time is O(n)O(n), 
where nn is the total number of nodes in the tree.

The number of recursive calls is bound by the height of the tree. In the worst case, 
the tree is linear and the height is in O(n)O(n). Therefore, space complexity due to 
recursive calls on the stack is O(n)O(n) in the worst case.


*/


boolean isMirror(TreeNode root){
  
  if(root == null)
    return true;
  
  return isMirror(root.left, root.right);
  
 }
    

//recursive
  boolean isMirror(TreeNode left, TreeNode right){  
    
    if(left == null && right == null){
      return true;
    }
    
    if(left == null || right == null)
      return false;
    
    if(left.data != right.data)
      return false;
    
    return isMirror(left.left, right.right) && isMirror(left.right, right.left);
  
}

//iterative


/*
  
  Complexity Analysis

Because we traverse the entire input tree once, the total run time is O(n)O(n), where nn is 
the total number of nodes in the tree.

There is additional space required for the search queue. In the worst case, we have to 
insert O(n)O(n) nodes in the queue. Therefore, space complexity is O(n)O(n).

*/

boolean isMirror(TreeNode root){
  Queue<TreeNode> queue = new Queue<TreeNode>();
  queue.add(root);
  queue.add(root);
    
  while(!queue.isEmpty()){
    
    TreeNode left = queue.poll();
    TreeNode right = queue.poll();
    
    if(left == null && right == null)
      continue;
    if(left == null || right == null)
      return false;
    if(left.data != right.data)
      return false;
    
    queue.add(left.left);
    queue.add(right.right);
    queue.add(left.right);
    queue.add(right.left);
  
  }

}