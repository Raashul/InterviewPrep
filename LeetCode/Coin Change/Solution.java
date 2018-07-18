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
    //create a memo for dynamic approach
    int[] cache = new int[amount];
    for(int i =0; i < cache.length; i++) cache[i] = -1;
    return coinChange(coins, amount, cache);
  }

  public int coinChange(int[] coins, int amount, int[] cache){
    if(amount ==0){
      return 0;
    }
    int min = amount;
    for(int coin: coins){
      if(amount - coin >= 0){ //check if can be deducted
        //check in the memo array
        //or
        //insert in the memo array
        int c;
        if(cache[amount-coin] >= 0){
          c = cache[amount- coin];
        }
        else{
          c = coinChange(coins, amount-coin, cache);
          cache[amount-coin] = c;
        }
        if(min > c + 1){
          min = c + 1;
        }
      }
    }
    return min;

  }

    
}
