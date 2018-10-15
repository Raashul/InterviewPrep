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
    int left = 0;
    int right = nums.length;
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
