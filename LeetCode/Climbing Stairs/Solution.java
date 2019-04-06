class Solution {

  //Brute Force : Approach 1

   public int climbStairs(int n) {
        climb_Stairs(0, n);
    }
    public int climb_Stairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    }

    /*
    Complexity Analysis
    Time complexity : O(2^n)
    Size of recursion tree will be 2^n

    Space complexity : O(n). The depth of the recursion tree can go upto nn.
    */

    //End of Brute force ------------------


  //Approach 2: Recursion with memorization

  /*
  In this way we are pruning recursion tree with the help of memomemo array and
  reducing the size of recursion tree upto n.
  */

  public int climbStairs(int n) {
      int[] map = new int[n+1];
      return climbStairs(n, 0, map);
  }

  public int climbStairs(int n, int totalStepsTaken, int[] map){
    if(totalStepsTaken > n){
      return 0;
    }
    if(totalStepsTaken == n){
      return 1;
    }
    if(map[totalStepsTaken] > 0){
      return map[totalStepsTaken];
    }

    map[totalStepsTaken] = climbStairs(n, totalStepsTaken+1, map) + climbStairs(n, totalStepsTaken +2, map);
    return map[totalStepsTaken];

  }

  class Solution {
  public int climbStairs(int n) {
    int[] dp = new int[n+1];
    return climbStairs(n, dp);
  }

  public int climbStairs(int n, int[] dp){

    if(n < 0) return 0;
    if(n == 0) return 1;
    if(dp[n] != 0) return dp[n];

    dp[n] = climbStairs(n-1, dp) + climbStairs(n-2, dp);

    return dp[n];
  }
}
}

// Time complexity : O(n). Size of recursion tree can go upto nn.

// Space complexity : O(n). The depth of recursion tree can go upto nn.


class Solution {
  public int climbStairs(int n) {
    HashMap<Integer, Integer> map = new HashMap<>();
    return helper(n, map);
  }
  
  public int helper(int n, HashMap<Integer, Integer> map) {
    if(n < 0) return 0;
    
    if(map.containsKey(n)) return map.get(n);
    
    if(n == 0) return 1;
    
    int val = helper(n-1, map) + helper(n-2, map);
    map.put(n, val);
    
    return map.get(n);  
  }
}
