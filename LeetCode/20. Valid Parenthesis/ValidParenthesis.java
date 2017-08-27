import java.util.Stack;

public class ValidParenthesis{
	
	public static boolean isValidString(String str){
		Stack<Character> st = new Stack<Character>();
		for(char c : str.toCharArray()){
			if(c == '('){
				st.push(')');
			}
			else if(c =='{'){
				st.push('}');
			}
			else if(c == '['){
				st.push(']');
			}
			else if(st.empty() || st.pop() != c){
				return false;
			}
		}
		return st.empty();
	}

	public static void main(String[] args){
		System.out.println(isValidString("()[]")); //true
		System.out.println(isValidString("([]{)}")); //false
		System.out.println(isValidString("([])")); //true

	}
}