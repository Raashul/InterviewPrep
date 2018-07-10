/*
  Suppose an array sorted in ascending order is rotated at some pivot unknown to you 
  beforehand.
(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
You are given a target value to search. If found in the array return its index, otherwise return -1.
You may assume no duplicate exists in the array.
Your algorithm's runtime complexity must be in the order of O(log n).

*/

class Solution {
  public int search(int[] nums, int target) {
    int low = 0, high = nums.length -1;
    return search(nums, low, high, target);
  }
  public int search(int[] nums, int low, int high, int target){
    int mid = (low + high) / 2;
    
    if(low > high){
      return -1;
    }
    
    if(nums[mid] == target){
      return mid;
    }
    
    if(nums[low] <= nums[mid]){
      if(nums[low] <= target && nums[mid] >= target){
          return search(nums, low, mid-1, target);
      }
      else{
          return search(nums, mid+1, high, target);
      }
    }
    else{
        if(nums[mid] <= target && nums[high] >= target){
            return search(nums, mid+1, high, target);
        }
        else{
            return search(nums, low, mid-1, target);
        }
    }
  }
}