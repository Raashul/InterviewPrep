public class Solution {
  public ArrayList<ArrayList<Integer>> combine(int A, int B) {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    if(A < B) return res;
    helper(A, B, res, new ArrayList<>(), 1);
    return res;
  }
  
  public void helper(int end, int len, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> temp, int start){
    if(temp.size() == len) {
      res.add(new ArrayList<>(temp));
      return;
    }
      
    for(int i = start; i <= end; i++){
      temp.add(i);
      helper(end, len, res, temp, i+1);
      temp.remove(temp.size()-1);
    } 
  }
}
