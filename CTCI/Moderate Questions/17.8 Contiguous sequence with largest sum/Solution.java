/*


*/

public class Solution{
	public static HashTable<Integer,Integer> getMaxSum(int[] a){

		HashTable<Integer, Integer> hash = new HashTable<Integer, Integer>();

		int[] arr = new int[];
		int maxSum = 0;
		int sum =0;
		for(int i =0; i < a.length; i++){
			sum += a[i];
			if(maxSum < sum){
				hash.put(a[i], i);
				maxSum = sum;
			}
			else if(sum < 0){
				hash.remove(a[i],i);
				sum = 0;
			}
		}
		return hash;
		//return maxSum;
	}

	public static void main(String[] args){
		int[] arr = {5,-9,6,-2,3};
		System.out.println(getMaxSum(arr));
	}
}