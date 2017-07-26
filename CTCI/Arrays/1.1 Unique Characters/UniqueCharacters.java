public class UniqueCharacters{

	public static boolean checkUniqueString(String str){

		if(str.length > 256) return false;

		//256 because there can be only 256 unique characters
		boolean[] char_set = new boolean[256];

		for(int i=0; i < str.length(); i++){
			int val = str.charAt(i);

			if(char_set[val]){
				return false;
			}
			char_set[val] = true;
		}
		return true;

	}

	public static void main(String[] args){
		System.out.println(checkUniqueString("Testing the test"));
		System.out.println(checkUniqueString("mango"));
		System.out.println(checkUniqueString("mM"));

	}
}

