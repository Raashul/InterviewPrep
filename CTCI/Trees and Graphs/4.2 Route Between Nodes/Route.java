/*
	Breath First First
	Operate by Queue
*/

public class Route{

	public enum State{
		Unvisited, Visiting, Visited;
	}

	public static boolean search(Graph g, Node start, Node end){
		
		LinkedList<Node> map = new LinkedList<Node>();

		for(Node u: g.getNode()){
			u.state = State.Unvisited;
		}
		start.state = state.Visiting;
		map.add(start);
		Node current;

		while(!map.isEmpty()){
			current = map.removeFirst();
			if(current != null){
				for(Node v: map.getAdjacent()){
					if(v.state != state.Visited){
						if(v == end)
							return true
						else{
							v.state = state.Visited;
							map.add(v);
						}
					}
				}
				current.state = state.Visited;
			}
		}
		return false;

	}

}