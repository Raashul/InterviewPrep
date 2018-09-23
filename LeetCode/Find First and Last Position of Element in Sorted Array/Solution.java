/*
Given an array of integers nums sorted in ascending order, find the starting and
ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].
*/


class Solution {
  public int[] searchRange(int[] nums, int target) {
    int leftIndex = findIndex(nums, target, true);
    int[] res = {-1,-1};
    if(leftIndex == -1){
      return res;
    }
    int rightIndex = findIndex(nums, target, false);
    res[0] = leftIndex;
    res[1] = rightIndex;
    return res;
  }

  public int findIndex(int[] nums, int target, boolean isLeft){
    int left = 0, right = nums.length; //right is at length
    int index = -1;
    while(left < right){
      int mid = left + (right - left) / 2;
      if(nums[mid] == target){
        index = mid;
        if(isLeft){
          right = mid;
        }
        else{
          left = mid + 1;
        }
      }
      else if(nums[mid] < target){
        if(isLeft){
          left = mid + 1;
        }
        else{
          left = mid;
        }
      }
      else{
        right = mid;
      }


    }
    return index;
  }

}
