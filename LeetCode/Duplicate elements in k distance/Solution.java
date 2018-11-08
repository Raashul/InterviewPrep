class Main{
  public boolean duplicateElements(int[] arr, int k){
    if(arr.length == 0) return false;
    HashSet<Integer> set = new HashSet<>();
    for(int i =0; i < arr.length; i++){
      if(set.contains(arr[i])) return true;

      if(!set.contains(arr[i])){
        set.add(arr[i]);
      }
      if(i >= k){
        set.remove(arr[i-k]);
      }
    }
  }
}