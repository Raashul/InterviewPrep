public class ListNode{
	int val;
	ListNode next;
	ListNode(int x){val = x;}
}

public ListNode swapNodes(ListNode head){

	if(head == null || head.next == null)
		return head;
	ListNode n = head.next;
	head.next = swapNodes(head.next.next);
	n.next = head;
	return n;
}
