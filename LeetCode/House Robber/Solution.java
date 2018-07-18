/*
You are a professional robber planning to rob houses along a street. 
Each house has a certain amount of money stashed, the only constraint stopping you from 
robbing each of them is that adjacent houses have security system connected and it will 
automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, 
determine the maximum amount of money you can rob tonight without alerting the police.

Example 1:

Input: [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.

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

    for(int i = nums.length-1; i >= 0; i--){
      dp[i] = Math.max(dp[i+1], dp[i+2] + nums[i]);
      max = dp[i];
    }
    return max;
  }
}