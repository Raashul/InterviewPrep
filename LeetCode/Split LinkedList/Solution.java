// write a funciton that divides linkedlist into two halves. return poiunter to the second
// half of the list.

private Node {
  int value;
  Node next;
}

public Node divide(Node root){
  if(root == null)
    return null;
  Node runner = root.next;

  while(runner != null){
    runner = runner.next;
    if(runner == null)
      break;
    runner = runner.next;
    root = root.next;
  }
  Node toReturn = list.next;
  root.next = null;
  return toReturn;

}
