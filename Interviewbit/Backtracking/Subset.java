class Solution{
  public ArrayList<ArrayList<Integer>> findSubsets(int[] arr){
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    Arrays.sort(arr);
    if(arr.length == 0) return res;
    findSubsetsHelper(arr, res, new ArrayList<>(), 0);
    return res;
  }
  
  public void findSubsetsHelper(int[] arr, ArrayList<ArrayList<Integer>> res, ArrayList<>() temp, int start){
    res.add(temp);
    for(int i = start; i < arr.length(); i++){
      temp.add(arr[i]);
      findSubsetsHelper(arr, res, temp, i+1);
      temp.remove(temp.size()-1);
    }
  }
}