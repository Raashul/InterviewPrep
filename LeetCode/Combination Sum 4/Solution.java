// Given an integer array with all positive numbers and no duplicates, find the number of possible combinations that add up to a positive integer target.

// Example:

// nums = [1, 2, 3]
// target = 4

// The possible combination ways are:
// (1, 1, 1, 1)
// (1, 1, 2)
// (1, 2, 1)
// (1, 3)
// (2, 1, 1)
// (2, 2)
// (3, 1)

// Note that different sequences are counted as different combinations.

// Therefore the output is 7.

class Solution {

  //recursive solution without DP.
  public int combinationSum4(int[] nums, int target) {
    if(target ==0){
      return 1;
    }
    int res = 0;
    for(int i=0; i < nums.length; i++){
      if(target >= nums[i]){
        res += combinationSum4(nums, target - nums[i]);
      }
    }
    return res;
  }

  //recursive solution with DP

  public int combinationSum4(int[] nums, int target){
    int[] dp = new int[nums.length + 1];
    Arrays.fill(dp, -1);
    dp[0] = 1;
    return helper(nums, target, dp);
  }

  public int helper(int[] nums, target, int[] dp){
    if(dp[target] != -1){
      return dp[target];
    }
    for(int i =0; i < nums.length; i++){
      if(target >= nums[i]){
        res += helper(nums, target, dp);
      }
    }
    dp[target] = res;
    return res;
  }
}