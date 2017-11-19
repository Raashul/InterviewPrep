/*

Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
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

public static ArrayList<Integer> threeSum(int[] num){
	Arrays.sort(num);
	ArrayList res = new ArrayList();

	for(int i=0; i < num.length-2; i++){

		if(i==0 || (i > 0 && num[i] != num[i-1])){
			int lo = i+1, hi = num.length-1, sum = 0 - num[i];

			while(lo < hi){
				if(num[lo] + num[hi] == sum){
					ArrayList<Integer> temp = new ArrayList<Integer>();
					temp.add(low);
					temp.add(high);
					temp.add(sum);
					
					res.add(temp);
					while(lo < hi && num[lo] == num[lo+1])
						lo++;
					while(lo < hi && num[hi] == num[hi-1])
						hi--;
					lo++;
					hi--;
				}
				else if(num[lo] + num[hi] < sum){
					lo++;
			}
			else{
				hi--;
			}
		}
	}
	}
	return res;
}


public static void main(String[] args){
		int []  s = {-1, 0, 1, 2, -1, -4,2};
		System.out.println(threeSum(s));
	}
}
