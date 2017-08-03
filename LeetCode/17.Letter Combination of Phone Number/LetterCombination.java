import java.util.LinkedList;

public class LetterCombination{
	
	public static LinkedList<String> letterCombination(String str){
		String [] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		LinkedList<String> result = new LinkedList<String>();
		result.add("");

		for(int i =0; i < str.length(); i++){
			int x = Character.getNumericValue(str.charAt(i));

			while(result.peek().length()
					==i){
				String curr = result.remove();
				char[] arr = map[x].toCharArray();
				for(char c: arr){
					result.add(curr+c);
				}
			}
		}
		return result;
	}

	public static void main(String[] args){
		System.out.println(letterCombination("23"));
		System.out.println(letterCombination("567"));
	}
}