public class Solution{
	public static void sum(LinkedListNode n1, LinkedListNode n2){

		while(n1 != null || n2 != null){
			int x, y, sum;
			int carry = 0;

			LinkedListNode p = n1;
			LinkedListNode q = n2;
			LinkedListNode dummyhead = new LinkedListNode(0);
			LinkedListNode current = dummyhead;


			if(p != null){
				x = n1.data;
			}
			else{
				x = 0;
			}

			if(q != null){
				y = n1.data;
			}
			else{
				y = 0;
			}

			sum = x+y+carry;
			carry = sum / 10;
			current.next = new LinkedListNode(sum%10);
			current = current.next;

			if(p!=null)
				p = p.next;

			if(q!=null)
				q = q.next;
		}
		if(carry > 0){
			current.next = new ListNode(carry);
		}
		return dummyhead.next;
	}
}