public class Solution{

  public Stack<Integer> sortAscending(Stack<Integer> gStack){
    Stack<Integer> stack1 = new Stack<Integer>();
    
    while(!gStack.isEmpty()){
      int tmp = gStack.pop();
      while(!stack1.isEmpty() && stack1.peek() < tmp){
        gStack.push(stack1.pop());
      }
      stack1.push(tmp);
    }
    return stack1;  
  }

}
