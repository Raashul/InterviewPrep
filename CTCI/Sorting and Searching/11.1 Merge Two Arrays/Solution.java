/*
You are given two sorted array. A and B, where A has a large enough buffer at the end
 to hold B.
Write a method to merge B into A in sorted order
*/

public class Solution{

	public static void merge(int[] arr1, int[] arr2){

		int lenA = arr1.length;
		int lenB = arr2.length;

		int indexA = lenA-1;
		int indexB = lenB-1;
		int mergedIndex = lenA + lenB -1;

		while(indexB >= 0 && indexA >= 0 ){
			if(arr1[indexA] > arr2[indexB]){
				arr1[mergedIndex] = arr1[indexA];
				indexA--;
			}
			else{
				arr1[mergedIndex] = arr2[indexB];
				indexB--;
			}
			mergedIndex--;
		}

		while(indexB >= 0 ){
			arr1[mergedIndex] = arr2[indexB];
			indexB--;
			mergedIndex--;
		}

	}

}

