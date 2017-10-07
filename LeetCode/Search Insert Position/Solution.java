public class Solution{

	public static int searchInsertPosition(int[] arr, int target){

		if(arr==null || arr.length == 0){
			return 0;
		}

		if(target > arr[arr.length-1])
			return arr.length;

		int low = 0, high = arr.length-1;

		while(low <=high){

			int mid = (low + high) / 2;
			if(arr[mid] == target){
				return mid;
			}

			else if(arr[mid] > target){
				high = mid -1;
			}

			else{
				low = mid + 1;
			}
		}
	}
	return low;

}