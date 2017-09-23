public class Solution{


//without finding the length
	public ListNode findIntersection(ListNode node1, ListNode node2){
		if(node1 == null || node2 == null){
			return null;
		}
		ListNode headofA = node1;
		ListNode headofB = node2;

		while(headofA != headofB){

			if(headofA == null){
				headofA = node2;
			}
			else{
				headofA = headofA.next;
			}

			if(headofB == null){
				headofB = node1;
			}
			else{
				headofB = headofB.next;
			}
		}
		return headofA;
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



