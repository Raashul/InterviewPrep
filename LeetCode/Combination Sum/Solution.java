/**
 * Given a set of candidate numbers (C) and a target number (T), find all unique 
 combinations in C where the candidate numbers sums to T.
 * The same repeated number may be chosen from C unlimited number of times.
 * Note:
 *      All numbers (including target) will be positive integers.
 *      Elements in a combination (a1, a2, … , ak) must be in non-descending order. 
 (ie, a1 ≤ a2 ≤ … ≤ ak).

 * The solution set must not contain duplicate combinations.

 * For example, given candidate set 2,3,6,7 and target 7, 
 * A solution set is: 
 * [7] 
 * [2, 2, 3] 
 */
 
public class Solution {
  public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    Arrays.sort(candidates);
    helper(candidates, 0, target, new ArrayList<Integer>(), res);
    return res;
  }
  
  public void helper(int[] candidates, int start, int target, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> res){
    if(target < 0 || start < 0 || start >= candidates.length)
        return;
    if(target == 0) {
        ArrayList<Integer> result = new ArrayList<Integer>(path);
        res.add(result);
    }else {
        for(int i = start; i < candidates.length && candidates[i] <= target; i++){
            path.add(candidates[i]);
            helper(candidates, i, target - candidates[i], path, res);
            path.remove(path.size() - 1); //reset the variable.
        }
    }
  }
 
}
