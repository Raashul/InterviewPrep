public class RemoveDuplicates{

	public static int[] removeDuplicates(int[] arr){
		if(arr.length ==0)
			return 0;
		int i = 0;
		for(int n: arr){
			if(i==0 || n > arr[i-1]){
				arr[i] = n;
				i++;
			}
		}
		return i;
	}

	public static void main(String[] args){
		int [] arr = {1,1,2,3,4,4,5,6,6};
		System.out.println(removeDuplicates(arr));
	}
}