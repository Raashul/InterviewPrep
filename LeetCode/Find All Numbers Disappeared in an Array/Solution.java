/*
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear 
twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list 
does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]


*/

public class Solution{


	public static ArrayList<Integer> dissapearNumber(int arr){
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(arr == null)
			return null;
		for(int i =0; i < arr.length; i++){
			int value = Math.abs(arr[i]) -1;
			if(arr[value] > 0){
				arr[value] = -arr[value];
			}
		}
		for(int i=0; i < arr.length; i++){
			if(arr[i] > 0){
				result.add(i+1);
			}
		}
	}

	public static void main(String[] args){
		int[] arr = [4,3,2,7,8,2,3,1];
		System.out.println(dissapearNumber(arr));
	}
}