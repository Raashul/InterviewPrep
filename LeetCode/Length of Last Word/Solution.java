public class Solution{

	//with str.trim() and str.lastindexof
	public int LengthOfLastWord(String str){
		if(str == null || str.length == null)
			return 0;

		str.trim();
		int length = str.length();
		int lastIndexOfSpace = str.lastIndexOf(" ");

		return length - lastIndexOf - 1;
	}

	//without any built-in functions
	public int LengthOfLastWord(String str){
		if(str == null || str.length == null)
			return 0;
		int last = str.length()-1;

		while(last >= 0 && str.charAt(last) == " "){
			last--;
		}

		int first = last;

		while(first >= 0 && str.charAt(first) != " "){
			first--;
		}

		return last-first;

	}


}