/*

Given a string which consists of lowercase or uppercase letters, 
find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.


*/
public class Solution {

	public int longestPalindrome(String s) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		int count = 0;

		for(int i = 0; i < s.length(); i++) {

			if(!map.containsKey(s.charAt(i))) {

				map.put(s.charAt(i), (int)(s.charAt(i)));

			}

			else {

				map.remove(s.charAt(i));
				count++;

			}

		}


		return map.isEmpty() ? count * 2 : count * 2 + 1;

	}

}

//1	2	2	1	3

