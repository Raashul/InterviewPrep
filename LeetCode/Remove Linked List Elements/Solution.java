/**
* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode(int x) { val = x; }
* }
*/

// Remove all elements from a linked list of integers that have value val.


class Solution {
  public ListNode removeElements(ListNode head, int val) {
    ListNode helper = new ListNode(0);
    helper.next = head;
    ListNode prev = helper;
    ListNode curr = head;

    while(curr != null){
      if(curr.val == val){
        prev.next = curr.next;
        curr = curr.next;
      }
      else{
        prev = curr;
        curr = curr.next;
      }
    }
    return helper.next;

  }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        if(head ==null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curt = dummy;

        while(curt.next !=null){
            if(curt.next.val==val){
                ListNode temp =curt.next;
                curt.next = temp.next;
            }
            else{
                curt = curt.next;
            }
        }

        return dummy.next;



    }
}
