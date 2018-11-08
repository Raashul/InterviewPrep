public class Solution {
  public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    if(A.size() == 0) return res;
    helper(A, res, new ArrayList<>());
    return res;
  }
  
  public void helper(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> temp){
    if(temp.size() ==  A.size()) {
      res.add(new ArrayList<>(temp));
      return;
    }
          
    for(int i = 0; i < A.size(); i++){
      if(temp.contains(A.get(i))) continue;
      temp.add(A.get(i));
      helper(A, res, temp);
      temp.remove(temp.size()-1);
    }
  }
}
