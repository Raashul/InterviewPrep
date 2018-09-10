class Solution {
  public List<Integer> topKFrequent(int[] nums, int k) {
    List<Integer> res = new ArrayList<>();
    if(k == 0) return res;
    Map<Integer,Integer> m = new HashMap<>();
    for(int i : nums){
        m.put(i,m.getOrDefault(i,0)+1);
    }
    List[] freq = new List[nums.length+1];
    for(int key : m.keySet()){
        int cnt = m.get(key);
        //this will reduce space for large array with repeating numbers
        if(freq[cnt]==null) freq[cnt] = new ArrayList<>();
        freq[cnt].add(key);
    }
    for(int i = nums.length; i >=0; i--){
        if(freq[i]==null) continue;
        res.addAll(freq[i]);
        if(res.size()>=k) break;
    }
    return res;

  }
}


class Solution {
  public List<Integer> topKFrequent(int[] nums, int k) {

    List<Integer> res = new ArrayList<>();
    if(k == 0) return res;

    List<Integer>[] bucket = new ArrayList[nums.length + 1];
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for(int num: nums){
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for(int i =0; i < bucket.length; i++) bucket[i] = new ArrayList();

    for(int key: map.keySet()){
      bucket[map.get(key)].add(key);
    }

    for(int i = bucket.length - 1; i >=0; i--){
      if(bucket[i] == null) continue;
      res.addAll(bucket[i]);
      if(res.size() >= k) break;
    }
     return res;
  }
}
