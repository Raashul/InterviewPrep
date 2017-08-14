public class RemoveDuplicates{

	public static void removeDuplicates(LinkedListNode n){
		Hashtable tb = new HashTable();
		LinkedListNode previous = null;

		while(n != null){
			if(tb.consists(n.data)){
				previous.next = n.next;
			}
			else{
				table.put(n.data, true);
				previous = n;
			}
			n = n.next;
		}
	}
}