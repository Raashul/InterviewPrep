public class Solution{
  Stack<Integer> stack1, stack2;
  
  public Solution(){
    stack1 = new Stack<Integer>();
    stack2 = new Stack<Integer>();
  }
  
  public int size(){
    return stack2.size() + stack2.size();
  }
  
  public void add(value){
    stack1.push(value)
  }
  
  public int dequeue(){
   shiftElements();
    return stack2.pop();
  }
  
  public int peek(){
    shiftElements();
    return stack2.peek();
  }
  
  public void shiftElements(){
     if(stack2.isEmpty()){
      while(!stack1.isEmpty()){
        stack2.push(stack1.pop())
      }
    }
    
  }
  
}


