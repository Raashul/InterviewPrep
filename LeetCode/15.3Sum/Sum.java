/*

Given an array S of n integers, are there elements a, b, c in S such that
 a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

*/

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Sum{

public static ArrayList<Integer> threeSum(int[] nums){
	Arrays.sort(nums);
	ArrayList res = new ArrayList();
	for(int i =0; i < nums.length -1;i++){
		if(i ==0 || (i > 0 && nums[i] != nums[i-1])){

			int low = i+1, high = nums.length -1; sum = 0 - nums[i];

			while(low < high){
				if(nums[low] + nums[high] == sum){
					ArrayList temp = new ArrayList();
					tmp.add(nums[i]);
					tmp.add(nums[low]);
					tmp.add(nums[high]);

					res.add(tmp);

					while(low < high && nums[low] == nums[low +1]){
						low++;
					}
					while(low < high && nums[high] == nums[high +1]){
						high--;
					}

					low++;
					high--;

				}
				else if(nums[low] + nums[high] < sum){
					low++;
				}
				else{
					high--;
				}
			}
		}
	}x
	return res;
}


public static void main(String[] args){
		int []  s = {-1, 0, 1, 2, -1, -4,2};
		System.out.println(threeSum(s));
	}
}
