  /*
  
    tight bound run time - O(n + km)

  */

  boolean containsTree(TreeNode t1, TreeNode t2){
    if(t2 ==  null){
      return false;
    }
    return checkSubTree(t1, t2);
  }
  
  boolean checkSubTree(TreeNode t1, TreeNode t2){
    if(t1== null){
      return false;
    }
    
    if(t1.data == t2.data){
      matchTrees(t1,t2);
    }
  }
  
 boolean matchTrees(TreeNode t1, TreeNode t2){
  
   if(t1 == null && t2 == null){
    return true;
   }
   
   if(t1 == null || t2 == null){
    return false;
   }
   
   if(t1.data != t2.data){
    return false;
   }
   
   return matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right);
 
 }

  