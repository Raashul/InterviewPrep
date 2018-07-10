// Find the contiguous subarray within an array (containing at least one number)
//which has the largest sum.

// For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
// the contiguous subarray [4,-1,2,1] has the largest sum = 6.
public int maximumSubArray(int [] arr){
  int[] dp = new int[arr.length];

  dp[0] = arr[0];
  int max = dp[0];

  for(int i=1; i < arr.length; i++){
    dp[i] = arr[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
    max = Math.max(dp[i], max);
  }
  return max;
}

class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far =Integer.MIN_VALUE, max_ending = 0;
        for(int i: nums){
            max_ending = i + max_ending;
            if(max_ending < 0){
                max_ending = 0;
            }
            else if(max_ending > max_so_far){
                max_so_far = max_ending;
            }
        }
        return max_so_far;
    }
}

Time Complexity: O(n)
