// Given an unsorted array of integers, find the length of the longest consecutive
// elements sequence.

// For example,
// Given [100, 4, 200, 1, 3, 2],
// The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

// Your algorithm should run in O(n) complexity.

public int longestConsecutiveSubsequence(int[] arr){
  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
  int sum = 0;
  int res = 0;

// [100, 4, 200, 1, 3, 2],
//                     ^
//   left = 1
//   right = 2
//   sum = 4
//   res = 4
//
//   map
//   100 - 1
//   4   - 1
//   200 - 1
//   1   - 4
//   3   - 4
//   4   - 2
//   2   - 4
//
  for(int i: arr){
    if(!map.contains(i)){
      left = (map.containsKey(i-1)) ? map.get(i-1) : 0;
      right = (map.containsKey(i+1)) ? map.get(i+1) : 0;
      sum  = left + right + 1;
      map.put(i, sum);
      res = Math.max(res, sum);

      map.put(i-left, sum);
      map.put(i+right, sum);
    }
  }
  return res;
}
