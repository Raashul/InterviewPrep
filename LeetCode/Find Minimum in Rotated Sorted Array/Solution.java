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
   int start = 0, end = nums.length -1;
   while(start < end){
     int mid = start + (end - start) / 2;
     if(nums[mid] > nums[end]){
       start = mid + 1;
     }
     else{
       end = mid;
     }
   }
   return nums[start];
 }
}
