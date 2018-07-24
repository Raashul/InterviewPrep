//Approach 1: Backtracking

/*
Time complexity : O(2^n)
​There are 2^n (upper bound) ways of jumping from the first position to the last,
where nn is the length of array nums.

Space complexity : O(n). Recursion requires additional memory for the stack frames.

*/
class Solution {

  public boolean canJump(int[] nums) {
    return canJumpFromPosition(0, nums);
  }

  public boolean canJumpFromPosition(int position, int[] nums){
    if(position == nums.length -1){
      return true;
    }
    int furthestJump = Math.min(position + num[position], nums.length -1);
    for(int nextPosition = position +1; nextPosition <= furthestJump; nextPosition++){
      if (canJumpFromPosition(nextPosition, nums)){
        return true;
      }

    }
    return false;
  }
}


//Approach 2: Dynamic Programming Bottom Up

/*
Time complexity : O(n^2)
​​For every element in the array, say i, we are looking at the next nums[i]
elements to its right aiming to find a GOOD index.
nums[i] can be at most n, where nn is the length of array nums.

Space complexity : O(n). This comes from the usage of the memo table.

*/

enum Index{
    GOOD, BAD, UNKNOWN
}

class Solution {

  public boolean canJump(int[] nums) {
    Index [] memo = new Index[nums.length];
    for(int i=0; i < nums.length; i++){
      memo[i] = Index.UNKNOWN;
    }
    memo[memo.length -1] = Index.GOOD;

    for(int i = nums.length-2; i >= 0; i--){
      int furthestJump = Math.min(i + nums[i], nums.length-1);
      for(int j = i +1; j <= furthestJump; j++){
        if(memo[j] == Index.GOOD){
          memo[i] = Index.GOOD;
          break;
        }
      }
    }

    return memo[0] == Index.GOOD;

  }
}


//Greedy Solution

/*
Time complexity : O(n).
We are doing a single pass through the nums array, hence nn steps, where n is the
length of array nums.

Space complexity : O(1).
We are not using any extra memory.

*/
class Solution {
  public boolean canJump(int[] nums) {
    int lastIndex = nums.length -1;

    for(int i = nums.length -1; i >= 0; i--){
      if(i + nums[i] >= lastIndex){
        lastIndex = i;
      }
    }
    return lastIndex == 0;
  }
}
