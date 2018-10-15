/**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode(int x) { val = x; }
* }
*/

//Recursive
class Solution {
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<LinkedList<Integer>> res = new ArrayList<>();
    List<List<Integer>> finalRes = new ArrayList<>();
    helper(root, res, 0);
    finalRes.addAll(res);

    return finalRes;
  }
  public void helper(TreeNode root, List<LinkedList<Integer>> res, int level){
    if(root == null) return;

    if(res.size() <= level)
      res.add(new LinkedList<>());

    if((level+1) % 2 == 1)
      res.get(level).add(root.val);
    else
      res.get(level).addFirst(root.val);

    helper(root.left, res, level+1);
    helper(root.right, res, level+1);


  }
}



//iterative

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
