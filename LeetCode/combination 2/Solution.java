class Solution {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(candidates);
    helper(res, candidates, target, new ArrayList<>(), 0);
    return res;
  }

  public void helper(List<List<Integer>> res, int[] candidates, int target, List<Integer> temp, int start){
    if(target < 0) return;
    if(target == 0) res.add(new ArrayList<>(temp));

    for(int i = start; i < candidates.length; i++){
      if(i > start && candidates[i] == candidates[i-1]) continue;
      temp.add(candidates[i]);
      helper(res, candidates, target-candidates[i], temp, i+1);
      temp.remove(temp.size()-1);
    }
  }
}
