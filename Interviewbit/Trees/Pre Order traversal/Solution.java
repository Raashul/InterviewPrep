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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        Stack<TreeNode> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();

        if(A == null) return res;

        st.push(A);

        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            res.add(curr.val);

            if(curr.right != null)
                st.push(curr.right);
            if(curr.left != null)
                st.push(curr.left);
        }
        return res;
    }
}
