public class Solution{
	Stack<Integer> st1 = new Stack<Integer>();
	Stack<Integer> st2 = new Stack<Integer>();

	public void push(int x){
		st1.push(x);
	}

	public int pop(){
		peek();
		st2.pop();
	}

	public boolean isEmpty(){
		return st1.empty() && st2.empty();
	}
	public int peek(){
		if(st2.empty()){
			while(st1.empty()){
				st2.push(s1.pop());
			}
		}
		return st2.peek();
	}
}