/*
You are a professional robber planning to rob houses along a street. 
Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, 
determine the maximum amount of money you can rob tonight without alerting the police.

*/

class Solution {
  public int rob(int[] nums) {
    if(nums.length == 1)
      return nums[0];
    int length = nums.length;
    int[] dp = new int[length + 2];
    dp[length] = 0;
    dp[length + 1] = 0;
    int max = 0;

    for(int i = nums.length-1; i > 0; i--){
      dp[i] = Math.max(dp[i+1], dp[i+2] + nums[i]);
        max = dp[i];
    }
     if(dp[1] <= dp[2]){
        return max + nums[0];
     }
      
    return max;
  }
}