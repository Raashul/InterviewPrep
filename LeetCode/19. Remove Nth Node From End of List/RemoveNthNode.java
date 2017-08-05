/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class RemoveNthNode{
	public ListNode NthNodeFromLast(ListNode head, int n){
		ListNode slow = head, fast = head;

		for(int i =0; i < n+1; i++){
			fast = fast.next;
			if(fast == null){
				//Removes the head of the linkedlist
				slow.next = null;
				return null;
			}
		}
		while(fast.next != null){
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;

	}
}
