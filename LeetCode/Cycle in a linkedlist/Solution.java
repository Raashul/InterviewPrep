/**
* Definition for singly-linked list.
* class ListNode {
*     int val;
*     ListNode next;
*     ListNode(int x) {
*         val = x;
*         next = null;
*     }
* }
*/
public class Solution {
  public boolean hasCycle(ListNode head) {

    if(head == null || head.next == null) return false;
    ListNode curr = head;
    ListNode runner = head.next;

    while(curr != runner){
      if(runner == null || runner.next == null) return false;
      curr = curr.next;
      runner = runner.next.next;
    }
    return true;
  }
}


//using hashset

public boolean hasCycle(ListNode head) {
    Set<ListNode> nodesSeen = new HashSet<>();
    while (head != null) {
        if (nodesSeen.contains(head)) {
            return true;
        } else {
            nodesSeen.add(head);
        }
        head = head.next;
    }
    return false;
}
