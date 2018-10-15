/*

Given a string, find the first non-repeating character in it and return it's index.
If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

https://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html

*/

public class Solution{

	public int firstUniqueCharacter(String s){

		if(s == null || s.length() ==0)
			return -1;

		if(s.length() == 1)
			return 0;

		int[] letterCount = new int[26];

		for(char c: s.toCharArray()){
			letterCount[c - 'a']++;
		}

		for(int i =0; i < s.length(); i++){
			if(letterCount[s.charAt(i) - 'a'] == 1){
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args){
		System.out.println(firstUniqueCharacter("leetcode"));
		System.out.println(firstUniqueCharacter("loveleetcode"));


	}

	public static char firstNonRepeatingChar(String word) {
		Set<Character> repeating = new HashSet<>();
		List<Character> nonRepeating = new ArrayList<>();
		for (int i = 0; i < word.length(); i++) {
			 char letter = word.charAt(i);
			 if (repeating.contains(letter)) { continue; }
			 if (nonRepeating.contains(letter)) {
				 nonRepeating.remove((Character) letter);
				 repeating.add(letter);
			 }
				 else {
					 nonRepeating.add(letter);
				 }
			 }
			 return nonRepeating.get(0); }


}
