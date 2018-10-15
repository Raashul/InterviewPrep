/*
Time complexity : O(S*n). where S is the amount, n is denomination count.
In the worst case the recursive tree of the algorithm has height of S and the algorithm
solves only S subproblems because it caches precalculated solutions in a table.
Each subproblem is computed with n iterations, one by coin denomination.
Therefore there is O(S*n) time complexity.

Space complexity : O(S), where S is the amount to change We use extra space for the
memoization table.

https://www.youtube.com/watch?v=qH7fVuYlOOc&t=16s
*/
class Solution {

  public int coinChange(int[] coins, int amount) {
      if (amount < 1) return 0;
      return coinChange(coins, amount, new int[amount]);
  }

  private int coinChange(int[] coins, int rem, int[] count) {
      if (rem < 0) return -1;
      if (rem == 0) return 0;
      if (count[rem - 1] != 0) return count[rem - 1];
      int min = Integer.MAX_VALUE;
      for (int coin : coins) {
          int res = coinChange(coins, rem - coin, count);
          if (res >= 0 && res < min)
              min = 1 + res;
      }
      count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
      return count[rem - 1];
  }


}
