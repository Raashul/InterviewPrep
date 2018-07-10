public class Solution{

  public static void main(String[] args){
    findRoute(Graph g, Node rootNode, Node target);
  }

  public static boolean findRoute(Graph g, Node rootNode, Node target){

    for(Node n: g.getNodes()){
      n.visited = false;
    }

    Queue queue = new LinkedList();
    queue.add(rootNode);
    rootNode.visited = true;

    while(!queue.isEmpty()){
      Node node = queue.remove();
      if(node != null){
        for(Node v: node.getAdjacent()){
          if(node.visited = false){
            if(node == target){
              return true;
            }
            queue.add(v);
          }
        }
      }
    }
  }
}