class Solution {
  public static ArrayList<ArrayList<Integer>> levelOrderTraversal(TreeNode root){
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(); 
    if(root == null){
      return node;
    }
    
    Queue<TreeNode> queue = new Queue<TreeNode>();
    int cLevel = 1;
    root.level = cLevel;
    
    queue.add(root);
    
    ArrayList<Integer> curr = new ArrayList<Integer>();
    curr.add(root.val);
    
    result.add(curr);
    ArrayList<Integer> currList = new ArrayList<Integer>();

    
    while(!queue.isEmpty()){
      

      TreeNode node = queue.remove();
      
      if(node.level > cLevel){
        result.add(currList);
        currList = new ArrayList<Integer>();
        cLevel++;
      }
      
      if(node.left !== null){
        node.left.level = cLevel + 1;
        currList.add(node.left);
        queue.add(node.left);
      }
      
      if(node.right !== null){
        node.right.level = cLevel + 1;
        currList.add(node.right);
        queue.add(node.right);
      }
      
    
    }
    
    
  }
}



