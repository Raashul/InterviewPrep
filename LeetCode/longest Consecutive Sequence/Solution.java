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



import java.util.*;

class Solution{
  public static void main(String[] args){
    int[] arr = {5,5,3,1};
    System.out.println(longestCons(arr));
  }

  public static int longestCons(int[] arr){

    int max = 0;
    if(arr.length == 0) return max;

    HashSet<Integer> hash = new HashSet<>();
    for(int n: arr){
      hash.add(n);
    }

    for(int num: hash){
      int length = 0;

      if(hash.contains(num-1)) continue;

      while(hash.contains(num++)){
        length++;
      }
      max = Math.max(max, length);
    }

    return max;

  }

}
