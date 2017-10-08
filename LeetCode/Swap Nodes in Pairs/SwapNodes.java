public class ListNode{
	int val;
	ListNode next;
	ListNode(int x){val = x;}
}

public ListNode swapNodes(ListNode head){

	if(head == null || head.next == null)
		return head;
	ListNode n = head.next;
	head.next = swap(head.next.next);
	n.next = head;
	return n;
}