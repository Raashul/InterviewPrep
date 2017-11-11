// Given an array of n integers where n > 1, nums, return an array output such
// that output[i] is equal to the product of all the elements of nums except nums[i].

// Solve it without division and in O(n).

// For example, given [1,2,3,4], return [24,12,8,6].

// Follow up:
// Could you solve it with constant space complexity?
// (Note: The output array does not count as extra space for the
//purpose of space complexity analysis.)


public int[] productExceptSelf(int[] nums){

  int length = nums.length;
  int left =1;
  int right = 1;
  int[] result = new int[length];

  for(int i =0; i < nums.length; i++){
    result[i] = left;
    left *= num[i];
  }

  for(int i = length -1; i >=0; i--){
    result[i] *= right;
    right *= num[i];
  }

  return result;

}
