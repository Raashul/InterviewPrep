/*
	A left rotation operation on an array of size  shifts each of the array's elements 
	 unit to the left. For example, if 2 left rotations are performed on array [1,2,3,4,5],
	  then the array would become [3,4,5,1,2].

*/

public class Solution{

	public static int[] rotate(int[] arr1, int r){
		int length = arr1.length;
		int[] result = new int[length];

		if(length == 0){
			return null;
		}
		for(int i =0; i < length; i ++){
			result[(i + length - r) % length] = arr1[i];
		}
		return result;
	}

	public static void main(String[] args){

		int[] arr1 = {1,2,3,4,5};
		int[] arr = rotate(arr1, 2);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}

}