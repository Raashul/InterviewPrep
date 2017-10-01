import java.util.Arrays;

public class LongestCommonSubstring{
	
	//Using Substring method
	public static String longestPrefix(String[] arr){
		
		if(arr == null || arr.length ==0)
			return "";
		
		String pre = arr[0];
		
		for(int i =1; i < arr.length; i++){
			while(arr[i].indexOf(pre) != 0){
				pre = pre.substring(0, pre.length()-1);
			}
		}
		return pre;
	}
	
	//Using sorting
	public static String longestPrefix2(String[] arr){
		if(arr == null || arr.length ==0)
			return "";
		
		StringBuilder result = new StringBuilder();
		
		Arrays.sort(arr);
		
		char [] arr1 = arr[0].toCharArray();
		char [] arr2 = arr[arr.length-1].toCharArray();
		
		for(int i=0; i < arr1.length; i++){
			if(arr2.length > 0 && arr1[i]==arr2[i]){
				result.append(arr2[i]);
			}
		}
		return result.toString();
		
	}

	public static void main(String[] args){
		String [] arr = {"zabcde", "abc", "ab", "abcd"};
		
		System.out.println(longestPrefix(arr));
		System.out.println(longestPrefix2(arr));
	}
}