import java.util.Stack;

public class Solution{
	
	public static  int validParenthesis(String str){
		int count = 0;
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0; i< str.length(); i++){
			if(str.charAt(i) =='(')
				st.push(')');
			else{
				if(st.empty() == false){
					st.pop();
					count++;
				}
				
				
			}
				
		}
		return count*2;
	}
	
	public static void main(String[] args){
		
		System.out.println(validParenthesis(")()())"));
	}
}

