public class Solution{
	public static LinkedListNode findBeginning(LinkedListNode head){
		LinkedListNode fast = head;
		LinkedListNode slow = head;

		//The runner technique
		//Make one pointer point at the collision spot. and the other at the beginning
		//of the LL
		//WHen they move together. THey will meet at the beginning of the loop
		while(fast != null || fast.next != null){
			slow = slow.next;
			fast = fast.next.next;

			if(fast == slow)
				break;
		}
		if(fast == null || fast.next == null)
			return null;

		slow = head;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
			
		}
		return fast;
	}
}	