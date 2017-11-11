/*
	Given an array of integers write a method to find indices m and n such that 
	if you sorted elements m through n, the entire array would be sorted. 
	Minimize n-m(that is find the smallest such sequence)

*/

public class Solution{

/*
{1,2,4,7,10,11,7,12,6,7,16,18,19};
						^       ^
end_left = 5
start_right = 8

min_index = 6
max_index = 7

SL(arr, 6, 5)

i = 5

*/
	public void findUnsortedSequence(int[] array){
		int end_left = findEndofLeftSubsequence(array);
		int start_right = findStartofRightSubsequence(array);

		int min_index = end_left + 1;
		if(min_index >= array.length)
			return; // already sorted
		int max_index = start_right - 1;
		for(int i =end_left; i <= start_right; i++){
			if(array[i] < array[min_index])
				min_index = i;
			if(array[i] > array[max_index])
				max_index = i;
		}
		int left_index = shrinkLeft(array, min_index, end_left);
		int right_index = shrinkRight(array, max_index, start_right);

		System.out.println(left_index + " " + right_index);
	}

	public int findEndofLeftSubsequence(int[] array){
		for(int i =1; i < array.length; i++){
			if(array[i] < array[i-1])
				return i-1;
			return array.length - 1;
		}
	}

	public int findStartofRightSubsequence(int[] array){
		for(int i =array.length-2; i >= 0; i--){
			if(array[i] > array[i+1])
				return i+1;
		}
		return 0;
	}

	public static int shrinkLeft(int[] array, int min_index, int start){
		int comp = array[min_index];
		for(int i = start - 2; i >=0; i--){
			if(array[i] <= comp)
				return i + 1;
		}
		return 0;
	}

	public static int shrinkRight(int[] array, int max_index; int start){
		int comp = array[max_index];
		for(int i =start; i < array.length; i++){
			if(array[i] > comp)
				return i - 1;
		}
		return 0;
	}

	public static void main(String[] args){
		int[] arr = {1,2,4,7,10,11,7,12,6,7,16,18,19};
		findUnsortedSequence(arr);
	}
}


