// Given an array of n integers where n > 1, nums, return an array output such
// that output[i] is equal to the product of all the elements of nums except nums[i].

// Solve it without division and in O(n).

// For example, given [1,2,3,4], return [24,12,8,6].

// Follow up:
// Could you solve it with constant space complexity?
// (Note: The output array does not count as extra space for the
//purpose of space complexity analysis.)


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left =1;
        int right = 1;
        int length = nums.length;
        int [] res = new int[length];
        
        for(int i=0; i < length ; i++){
            res[i] = left;
            left *= nums[i];
        }
        
        for(int i = length -1; i >=0; i--){
            res[i] *= right;
            right *= nums[i];
        }
        return res;
        
    }
}
