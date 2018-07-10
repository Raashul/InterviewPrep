/*

*/

public class SetOfStacks{
  
  ArrayList<Stacks> stacks = new ArrayList<Stack>();

  public void push(int v){
    Stack last = getLastStack();
    if(last != null || !last.isFull()){
      last.push(v);
    }
    else{
      Stack<Integer> stack = new Stack<Integer>();
      stack.push(v);
      stacks.add(stack);
    }
  }

  public int pop(){
    Stack last = getLastStack();
    int v = last.pop();
    if(last.size == 0){
      stacks.remove(stacks.size() - 1);
    }
  }

  public Stack getLastStack(){
    if(stacks.size() ==0 ){
      return null;
    }
    return stacks.get(stacks.size()-1);

  }
}