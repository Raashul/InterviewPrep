public class Solution{

	public static vector<int>  searchForRange(int[] arr, int target){
		int i =0, j = n-1;
		vector<int> ret(2,-1);

		while(i<j){
			int mid = (i + j ) /2;
			if(arr[mid] < target)
				i = mid + 1;
			else
				j = mid;
		}

		if(arr[i] != target)
			return ret;
		else
			ret[0] = i;

		j = n -1;
		while(i<j){
			int mid = (i+j)/2 +1;
			if(arr[mid] > target)
				j = mid -1;
			else
				i=mid;
		}
		ret[1] = j;
		return ret;
	}

	public static void main(String[] args){
		int arr = {5,6,7,7,8,8,10};
		System.out.println(searchForRange(arr, 8));
	}
}

