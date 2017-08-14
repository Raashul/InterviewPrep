public class Solution{
	public static boolean check(LinkedListNode head){
		LinkedListNode fast = head;
		LinkedListNode slow = head;

		Stack<Integer> st = new Stack<Integer>();

		while(fast != null && fast.next != null){
			st.push(slow.data);
			fast = fast.next.next;
			slow = slow.next;
		}
		if(fast != null){
			slow = slow.next;
		}
		while(slow != null){
			int top = st.pop().intValue();

			if(slow.data != top){
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
}