public class Solution{
  public class solve(TreeNode root){
    ArrayList<LinkedList<Integer>> res = new ArrayList<>();
    if(root == null) return res;
    helper(res, root, 0);
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    result.addAll(res);
    return result;
  }

  public void helper(ArrayList<ArrayList<Integer>> res, TreeNode root, int level){
    if(root == null) return;
    if(res.size() <= level)
      res.add(new LinkedList<>());

    if((level+1) % 2 != 0){
      res.get(level).add(root.val);
    }
    else{
      res.get(level).addFirst(root.val);
    }

    helper(res, root.left, level+1);
    helper(res, root.right, level+1);

  }
}




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
    int level = 0;
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(A == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(A);

        while(!queue.isEmpty()){
            level++;
            int size = queue.size();
            ArrayList<Integer> left = new ArrayList<>();
            Stack<Integer> right = new Stack<>();


            for(int i =0; i < size; i++){
                TreeNode node = queue.poll();

                if(level % 2 == 0)
                    right.push(node.val);
                else
                    left.add(node.val);

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);

            }

            if(level % 2 == 0){
                while(!right.isEmpty()){
                    left.add(right.pop());
                }
            }
            res.add(left);

        }
        return res;
    }


}
