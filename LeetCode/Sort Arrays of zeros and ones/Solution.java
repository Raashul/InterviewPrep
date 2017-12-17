public class Solution{

	public static int[] sort(int[] arr){
		int i =0;
		for(int n: arr){
			if(n == 0){
				arr[i++] = 0;
			}
		}

		while(i < arr.length){
			arr[i++] = 1;

		}
		return arr;
	}
	
}

