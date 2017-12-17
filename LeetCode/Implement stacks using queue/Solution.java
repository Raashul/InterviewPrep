import java.util.*;
public class HelloWorld{
    
    private static Queue<Integer> queue1 = new LinkedList<>();
    private static Queue<Integer> queue2 = new LinkedList<>();
    private static int top = 0;
    
    public static void push(int x){
        queue1.add(x);
        top = x;
    }
    
    public static int top(){
        return top;
    }
    
    public static void pop(){
        while(queue1.size() > 1){
            top = queue1.remove();
            queue2.add(top);
        }
        queue1.remove();
        Queue<Integer> temp = queue1;
        top = queue2.peek();
        queue1 = queue2;
        queue2 = temp;
       
    }
    
    public static boolean isEmpty(){
        if( queue1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    
    

     public static void main(String []args){
        HelloWorld.push(2);
        HelloWorld.push(4);
        HelloWorld.push(5);
        HelloWorld.push(6);

        HelloWorld.pop();
         System.out.println(HelloWorld.top());

        
       
     }
}