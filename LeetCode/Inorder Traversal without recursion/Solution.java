
public class Node{
  private Node left;
  private Node right;
  private int value;
}

private static void traverse(TreeNode root){
  
  Stack<Node> st = new Stack<Node>();
  addAllLeftNodes(root, st);
  while(!st.isEmpty()){
    Node current = st.pop();
    System.out.println(current);
    if(current.right != null){
      addAllLeftNodes(current.right, st);
    }
  }
}

private static void addAllLeftNodes(TreeNode root, Stack<Node> st){
  
 while(root != null){
    st.push(root);
    root = root.left;
 }

}
