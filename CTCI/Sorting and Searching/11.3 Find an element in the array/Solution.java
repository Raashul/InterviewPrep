/*
	Given a sorted array of n integers that has been rotated an unknown number of 
	times, 
	write code to find an element in the array. You may assume that the array was 
	originally sorted in increasing order

	Run time - O(logn)  if all elements are unique

	O(n)- if many elements are duplicate. Because of many duplicates 

	we have to search both left and right side of the arrays
	
*/

public class Solution{

	public static int search(int[] arr, int left, int right, int target){
		int mid = (left + right) / 2;

		if(target == arr[mid]){
			return mid;
		}

		if(left > right)
			return -1;
		

		if(arr[left] < arr[mid]){ //left is normally ordered
			
			if(target >= arr[left] && target <= arr[mid])
				return search(arr, left, mid - 1, target);
			else
				search(arr, mid + 1, right, target);	
		}


		else if(arr[left] > arr[mid]){ //right is normally ordered
			

			if(target >= arr[mid] && target <= arr[right])
				return search(arr, mid + 1, right, target);
			else
				return search(arr, left, mid - 1, target);
		}

		else if(arr[left] == arr[mid]){ //this means left are all repeats
			
			if(arr[mid] != arr[right]){ //check mid and rightmost element
				return search(arr, mid + 1, right, target);
			}
			else{
				int result = search(arr, left, mid - 1, target);

				if(result == -1)
					return search(arr, mid + 1, right, target);
				else
					return result;
			}
		}
		
	return -1;
	}


	public static void main(String [] args){
		int [] arr = {50, 5, 20, 30, 40};
		int len = (arr.length) - 1;
		System.out.println(search(arr, 0, len, 30));
		
	}


}

	