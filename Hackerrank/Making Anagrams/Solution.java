/*
	
	Given two strings,  a and b , that may or may not be of the same length, 
	determine the minimum number of character deletions required to make a and  b
	anagrams. Any characters can be deleted from either of the strings.

*/

public class Solution{

	public static int anagrams(String str1, String str2){
		int[] letterCount = new int[26];
		int difference= 0 ;

		for(char c: str1.toCharArray()){
			letterCount[c - 'a']++;
		}

		for(char c: str2.toCharArray()){
			letterCount[c - 'a']--;
		}

		for(int i: letterCount){
			result += Math.abs(i);
		}
		return result;
	}



	public static void main(String[] args){
		String str1 = "cde";
		String str2 = "abc";

		System.out.println(anagrams(str1, str2));
	}
}