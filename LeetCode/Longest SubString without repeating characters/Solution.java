
//my solution
public class LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {

    // return string's length if the length is equal or less than 1
    if (s.length() <= 1) {
      return s.length();
    }

    int longest = 0;
    LinkedList<Character> queue = new LinkedList<>();
    for (char c : s.toCharArray()) {
      if (queue.contains(c)) {
        longest = longest < queue.size() ? queue.size() : longest;

        // remove till removing the current character
        while (queue.contains(c)) {
          queue.removeFirst();
        }

        queue.addLast(c);
      } else {
        queue.addLast(c);
      }
    }

    longest = longest < queue.size() ? queue.size() : longest;
    return longest;

	}
}
/*
At worse case, each node is visited twice
O(2n)

*/
public class Solution {
  public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    Set<Character> set = new HashSet<>();
    int ans = 0, i = 0, j = 0;
    while (i < n && j < n) {
      // try to extend the range [i, j]
      if (!set.contains(s.charAt(j))){
        set.add(s.charAt(j++));
        ans = Math.max(ans, j - i);
      }
      else {
        set.remove(s.charAt(i++));
      }
    }
    return ans;
  }
}


class Solution {
	public int lengthOfLongestSubstring(String s) {
			if(s.length() == 0 || s.length() == 1) return s.length();

			int index1 = 0;
			int index2 = 0;
			int length = 0;
			int max_length = 1;
			int[] arr = new int[128];

			while((index1 < s.length()) && (index2 < s.length())){
					char c = s.charAt(index2);

					if(arr[c] == 0){
							arr[c] = 1;
							index2++;
							length++;
					}
					else{
							if(length > max_length){
									max_length = length;
							}

							if(index1 != index2) arr[s.charAt(index1)] = 0;
							index1++;
							length--;
					}
			}

			return ((index2 - index1) > max_length) ? (index2 - index1) : max_length;
	}
}


