/*
The minimum element must satisfy one of two conditions: 
1) If rotate, A[min] < A[min - 1]; 
2) If not, A[0]. 
Therefore, we can use binary search:
check the middle element,
 if it is less than previous one, then it is minimum. 
 If not, there are 2 conditions as well: 
 If it is greater than both left and right element, 
 then minimum element should be on its right, otherwise on its left.
 */

 class Solution {
  public int findMin(int[] nums) {
    int left = 0, right = nums.length -1;
    int res = nums[0];

    if(nums.length == 1){
      return res;
    }

    while(left < right){
      int mid = (left + right) / 2;

      if(nums[mid] < nums[mid] -1){
        res = nums[mid];
        break;
      }

      else if(nums[mid] > nums[right]){
        left = mid + 1;
      }

      else{
        right = mid - 1;
      }
     
    }

    return res;
  }
}