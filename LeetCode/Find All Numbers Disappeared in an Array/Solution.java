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

	public static int dissapearNumber(int[] arr){

		if(arr == null || arr.length == 0){
			return 0;
		}
		Arrays.sort(arr);
		int j=0;
		int[] arr1;

		for(int i=0; i < arr.length; i++){

			if(arr[i] == arr[i+1]){
				break;
			}
		
			while(arr[i+1] != arr[i]+1){
				arr1[j] == arr[i]++;
			}
		}
		return arr1;

	}

	public static void main(String[] args){
		int[] arr = [4,3,2,7,8,2,3,1];
		System.out.println(dissapearNumber(arr));
	}
}