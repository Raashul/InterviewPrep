//Java Strings are not zero-terminated,

public class NullTerminatingString{

	public static String reverse(String str){

		int n = str.length();
		char [] char_array = str.toCharArray();

		for(int i=0; i < n/2; i++){
			char tmp  = str.charAt(i);
			char tmp2 = str.charAt(n-i-1);
			char_array[i] = tmp2;
			char_array[n-i-1] = tmp;
		}
		return String.valueOf(char_array);

	}

	public static void main(String[] args){
		System.out.println(reverse("aaaaa "));
	} 
}