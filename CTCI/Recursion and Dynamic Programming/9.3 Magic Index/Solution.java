/*
	part1- A magic index where A[1...n-1] where the array is sorted. 
	such that a[i] = i

	part2- what if the values are distinct
*/

public class Solution{

	//part 1
	public static int search(int[] arr, int start, int end){

		if(start > end || start < 0 || end > arr.length){
			return -1;
		}
		
		int mid = (start + end) / 2;
		if(arr[mid] == mid)
			return mid;
		
		else if(arr[mid] > mid){
			//recurse left
			return search(arr, start, mid-1);
		}
		else{
			return search(arr, mid+1, end);
		}

	}

	//part 2

	public static int search2(int[] arr, int start,int end){

		if(start > end || start < 0 || end > arr.length){
			return -1;
		}

		int midIndex = (start + end) / 2;
		int midVal = arr[midIndex];

		if(midVal == midIndex)
			return midIndex;

		int leftIndex = Math.min(midIndex-1, midVal);
		int left = search2(arr, start, leftIndex);
		if(left >= 0){
			return left;
		}
		int rightIndex = Math.max(midIndex+1, midVal);
		int right = search2(arr, rightIndex, end);
		return right;
		

	}

	public static void main(String[] args){
		int[] arr = {-40,-20,-1,1,2,3,5,7,9,12,13};
		
		int[] arr2 = {-10,-5,2,2,2,3,4,7,9,12,13};
		System.out.println(search(arr, 0, arr.length-1));
		System.out.println(search2(arr2, 0, arr.length-1));
	}

}