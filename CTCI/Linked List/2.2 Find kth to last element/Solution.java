public class Solution{

	public static findElement(LinkedListNode head, int n){
		if(head == null || head.next == null)
			return head;
		LinkedListNode p1, p2;

		for(int i =0; i < n-1; i++){
			if(p2 == null)
			 return null
			p2 = p2.next;
		}

		while(p2.next != null){
			p2 = p2.next;
			p1 = p1.next;
		}
		return p1;
	}

}