/*
Given an unsorted array of integers, find the length of longest increasing subsequence.

Example:

Input: [10,9,2,5,3,7,101,18]
Output: 4 
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 


*/


/*

Recursion with memorization [Memory Limit Exceeded]

  Time complexity : O(n^2) - Two loops of n are there.

  Space complexity : O(n)- dp array of size n is used.
*/

class Solution {
  public int lengthOfLIS(int[] nums) {
    if(nums.length == 0){
      return 0;
    }
    int[] cache = new int[nums.length];
    cache[0] = 1;
    int maxLength = 0;

    for(int i = 1; i < nums.length; i++){
      int maxVal = 0;
      for(int j =0; j < i; j++){
        if(nums[i] > nums[j]){
          maxVal = Math.max(cache[j], maxVal);
        }
      }
      cache[i] = maxVal + 1;
      maxLength = Math.max(maxLength, cache[i]);
    }
    return maxLength;
  }  
}