class Node {
	public int keu;
	public int val;
	public Node prev;
	public Node next;

	public Node(int key, int val){
		this.key = key;
		this.val = val;
		prev = next = null;
	}
}


public class Solution{
	HashMap<Integer, Node> map;
	Node start;
	Node end;
	int capacity;

  public Soution(int capacity) {
		map = new HashMap<>();
		start = new Node(0,0);
		end = new Node(0,0);
		this.capacity = capacity;
		start.next = end;
		end.prev = start;
  }

  public int get(int key) {
		if(map.containsKey(key)){
			Node node = map.get(key);
			removeNode(node);
			addNode(node);
			return node.val;
		}
		return -1;
  }

  public void put(int key, int value) {
		Node node = new Node(key, value);

		if(map.containsKey(key)){
			Node temp = map.get(key);
			removeNode(temp);
			addNode(node);
		} else {
			if(capacity == map.size()){
				Node temp = end.prev;
				removeNode(temp);
				map.remove(temp.key);
			}
			addNode(node);
		}

		map.put(key, node);

  }


	private void addNode(Node node){
		node.next = start.next;
		start.next = node;
		node.prev = start;
		node.next.prev = node;
	}

	private void removeNode(Node node){
		Node temp = node.next;
		node.prev.next = temp;
		temp.prev = node.prev;
	}

}



//second way 
class LRUCache {
  private int c;
  private HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
  private ArrayList<Integer> l= new ArrayList<Integer>();
  private int count=0;
  
  public LRUCache(int capacity) {
    this.c = capacity;
  }

  public int get(int key) {
    if(hm.containsKey(key)){
      removeElement(key);
      addInFront(key, hm.get(key));
      return hm.get(key);
    }
    return -1;
  }
  
  public void removeElement(int no){
    int index = l.indexOf(no);
    l.remove(index);
    count--;
  }
  
  public void addInFront(int key, int no){
    l.add(0, key);
    hm.put(key, no);
    count++;
  }
  
  public void removeLast(){
    int key = l.get(l.size()-1);
    l.remove(l.size()-1);
    hm.remove(key);
    count--;
  }

  public void put(int key, int value) {
    if(!hm.containsKey(key)){
      if(count < c){
        addInFront(key, value);
      } else {
        removeLast();
        addInFront(key, value);
      }
      
    } else {
      removeElement(key);
      addInFront(key, value);
    }
  }
  
  
}

/**
* Your LRUCache object will be instantiated and called as such:
* LRUCache obj = new LRUCache(capacity);
* int param_1 = obj.get(key);
* obj.put(key,value);
*/