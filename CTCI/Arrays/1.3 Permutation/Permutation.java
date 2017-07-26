public class Permutation{


/*

With sorting

*/
	public static String permutation(String str, String str2){
		
		if(str.length() != str2.length()) 
			return false;
		return sort(str).equals(sort(str2));
	}

	public static String sort(String s){
		char[] char_array = s.toCharArray();
		Array.sort(char_array);
		return String.valueOf(char_array);
	}


	public static void main(String[] args){
		System.out.println(permutation("god", "dog"));
		System.out.println(permutation("god   ", "dog"));

	} 
}