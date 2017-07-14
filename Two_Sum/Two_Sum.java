/*
	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	You may assume that each input would have exactly one solution, and you may not use the same element twice.
	Example:
	Given nums = [2, 7, 11, 15], target = 9,

	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
*/

	public class Solution{
		public int[] twoSum(int[] nums, int target){
			Map<Integer, Integer> map = new HashMap<>();
			for(int i=0; i < nums.length; i+){
				int complement = target - nums[i];
				if(map.containsKey(complement)){
					int [] arr = { map.get(complement), i };
					return arr;
				}
				// Map[0] -> 2 , 	0
				// Map[1] -> 7 , 	1
				// Map[2] -> 11 , 2
				// Map[3] -> 15 , 3
				map.put(nums[i], i);
			}

			throw new IllegalArgumentException("No two sums solution")
		}
	}