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
    int end = 0;
    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() == 0) return null;
        end = 0;
        return constructBST(B, A, 0, B.size()-1);
    }
    
    public TreeNode constructBST(ArrayList<Integer> inorder, ArrayList<Integer> preorder, int preOrderStart, int preOrderEnd){
        
        if(preOrderStart > preOrderEnd) return null;
        
        if(end == preorder.size()) return null;
        
        TreeNode root = new TreeNode(preorder.get(end++));
        
        if(preOrderStart == preOrderEnd) return root;
        
        int idx = findIdx(inorder, preOrderStart, preOrderEnd, root.val);
        
        root.left = constructBST(inorder, preorder, preOrderStart, idx-1);
        root.right = constructBST(inorder, preorder, idx+1, preOrderEnd);
        
        return root;
        
    }
    
    public int findIdx(ArrayList<Integer> inorder, int start, int end, int num){
        for(int i = start; i <= end; i++){
            if(inorder.get(i) == num) return i;
        }
        return -1;
    }
}




