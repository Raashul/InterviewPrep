/*

 Using Stack

For every '(’ encountered, we push its index onto the stack.

For every ‘)’ encountered, we pop the topmost element and subtract the current element's index

from the top element of the stack, which gives the length of the currently encountered valid string
of parentheses. If while popping the element, the stack becomes empty, we push the current element's
index onto the stack. In this way, we keep on calculating the lengths of the valid substrings, and
return the length of the longest valid string at the end.

*/

class Solution {
  public int longestValidParentheses(String s) {
		int max = 0;

		Stack<Integer> st = new Stack<Integer>();
		st.push(-1);

		for(int i =0; i < s.length(); i++){
			if(s.charAt(i) == '('){
				st.push(i);
			}
			else{
				st.pop();
				if(st.isEmpty()){
					st.push(i);
				}
				else{
					max = Mat.max(max, i - st.peek());
				}
			}
		}
    return max;
	}
}




//Without extra space

/*
In this approach, we make use of two counters leftleft and rightright.
First, we start traversing the string from the left towards the right and for every ‘(’
 encountered, we increment the left counter and for every ‘)’ encountered,
 we increment the right counter. Whenever left becomes equal to right, we calculate
 the length of the current valid string and keep track of maximum length substring found so far.
  If rightright becomes greater than leftleft we reset left and right to 0.

*/


class Solution {
  public int longestValidParentheses(String s) {
		int left = 0, right = 0, max = 0;

		for(int i =0; i < s.length(); i++){
			if(s.charAt(i) == '('){
				left++;
			}
			else{
				right++;
			}

			if(left == right){
				max = Math.max(max, right*2);
			}
			else if(right > left){
				left = right = 0;
			}
		}

		left = right = 0;

		for(int i = s.length() -1 ; i >= 0; i--){
			if(s.charAt(i) == '('){
				left++;
			}
			else{
				right++;
			}

			if(left == right){
				max = Math.max(max, left*  2);
			}
			else if(left > right){
				left = right = 0;
			}
		}

		return max;

	}

}
