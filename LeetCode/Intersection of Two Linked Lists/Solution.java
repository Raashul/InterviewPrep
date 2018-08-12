public class Solution{

	//without finding the length
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	  //boundary check
	  if(headA == null || headB == null) return null;

	  ListNode a = headA;
	  ListNode b = headB;

	  //if a & b have different len, then we will stop the loop after second iteration
	  while( a != b){
	  	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
      a = a == null? headB : a.next;
      b = b == null? headA : b.next;
	  }

	  return a;
	}

	//by finding the length

	public ListNode findIntersection(ListNode node1, ListNode node2){

		if(node1 == null || node2 == null){
			return null;
		}

		int lenA = length(node1), lenB = length(node2);

		while(lenA > lenB){
			node1 = node1.next;
			lenA--;
		}

		while(lenB > lenB){
			node2 = node2.next;
			lenB--;
		}

		while(node1 != node2){
			node1 = node1.next;
			node2 = node2.next;
		}

	}

	public int length(ListNode node){
		int length = 0;
		while(node != null){
			node = node.next;
			length++;
		}

		return length;
	}

}
