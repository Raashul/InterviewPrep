class Node{
  int value;
  Node next;
  Node(int data){
    value = data;
    next = null;
  }
}

class Solution{

  Node head;

  public void push(int d){
    Node node = new Node(d);
    node.next = head;
    head = node;
  }

  public int removeFromEnd(int n){
    Node fast = head, slow = head;
    for(int i =0; i < n; i++){
      fast = fast.next;
      if(fast.next == null){
        head = head.next;
        return head.value;
      }
    }

    while(fast.next != null){
      slow = slow.next;
      fast = fast.next;
    }
    slow.next = slow.next.next;
    Node r = slow.next;
    return r.value;

  }

  public static void main(String[] args){
    Solution linkedList = new Solution();
    linkedList.push(5);
    linkedList.push(4);
    linkedList.push(3);
    linkedList.push(2);
    linkedList.push(1);

    System.out.println(linkedList.removeFromEnd(5));
  }

}
