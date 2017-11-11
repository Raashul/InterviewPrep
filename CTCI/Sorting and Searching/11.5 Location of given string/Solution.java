/*
	Given a sorted array of strings which is interspersed with empty strings, write a
	method to find the location of given string.
*/

public class Solution{

	public static int search(String[] arr, String str){
		if(arr == null || str == null || str == ""){
			return -1;
		}
		return searchR(arr, str, 0, arr.length-1);
	}

	public static int searchR(String[] arr, String str, int first, int last){
		int mid = (first + last) / 2;

		if(arr[mid] == str)  //Found the string
			return mid;

		if(arr[mid].isEmpty()){
			int left = mid -1;
			int right = mid +1;

			while(true){
				
				if(left < first && right > last)
					return -1;
				else if(left >= first && !arr[left].isEmpty()){
					mid = left;
					break;
				}
				else if(right <= last && !arr[right].isEmpty()){
					mid = right;
					break;
				}
				left--;
				right++;
			}

		}

		//Check for the string using compareto. Use recursion
		if(arr[mid] == str){
			return mid;
		}
		//arr[mid].compareTo(str) ---> str - arr[mid]
		//if -> str - arr[mid] < 0. it means arr[mid] is a smaller value. So move right
		//else move left
		
		else if(arr[mid].compareTo(str) < 0){ //move right
			return searchR(arr, str, mid + 1, last);
		}
		else{
			return searchR(arr, str, first, mid - 1);
		}

	}



	
	public static void main(String[] args){
		String[] arr = {"abc", "bca", "", "", "test", "", "testt", "", "testz","zebra", ""};
		System.out.println(search(arr,"testz"));
	}

}