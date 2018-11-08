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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        if(A == null) return res;
        helper(A, B, st, res);
        return res;
    }

    public void helper(TreeNode A, int B, Stack<Integer> st, ArrayList<ArrayList<Integer>> res){
        st.push(A.val);

        //check leaf
        if(A.left == null && A.right == null){
            if(A.val == B) res.add(new ArrayList<>(st));
        }

        if(A.left != null) helper(A.left, B - A.val, st, res);
        if(A.right != null) helper(A.right, B - A.val, st, res);

        st.pop();

    }
}
