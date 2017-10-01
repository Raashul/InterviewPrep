// Write a method to replace all spaces in a string with '%20.' You may assum ethat the string
// has sufficient space at th end of the string to hold the additional characters, and that 
//you are given the "true" length of the string. (Note: if implementing in Java,please use 
//characters  array so that you can perform this operation in place)

public class Solution {
	public static String replaceSpaces(String s) {

		int spaceCount = 0, newLength; 
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				spaceCount++;
			}
		}
		char[] result = new char[s.length() + spaceCount *2];
		int length = s.length();

		newLength = length + spaceCount * 2;
		result[newLength-1] = '\0';
		for(int i = length - 1; i >= 0; i--) {
			if(s.charAt(i) == ' ') {
				result[newLength - 1] = '0';
				result[newLength - 2] = '2';
				result[newLength - 3] = '%';
				newLength = newLength - 3;
			}
			else {
				result[newLength - 1] = s.charAt(i);
				newLength = newLength - 1;
			}
		}
		return String.valueOf(result);
	}
	
	public static void main(String [] args){
		System.out.println(replaceSpaces("I am fb"));
	}
}