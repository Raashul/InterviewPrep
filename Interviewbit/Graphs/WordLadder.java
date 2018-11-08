public class Solution {
  public int ladderLength(String start, String end, ArrayList<String> dictV) {
    Queue<String> queue = new LinkedList<>();
    int[] visited = new int[dictV.size()];
    
    if(!dictV.contains(end)) return 0;
    
    queue.add(start);
    int ladder = 1;
    
    while(!queue.isEmpty()){
      int size = queue.size();
      for(int j =0; j < size; j++){
        String curr = queue.remove();
        if(canBeTransformed(curr, end)){
          return ladder + 1;
        }
        for(int i =0; i < dictV.size(); i++){
          if(visited[i] == 0){
            if(canBeTransformed(curr, dictV.get(i))){
              visited[i] = 1;
              queue.add(dictV.get(i));
            }
          }
        }
      }
    
      ladder++;
    }
    return 0;
  }
  
  public boolean canBeTransformed(String start, String end){
    int n = 0;
    for(int i =0; i < start.length(); i++){
      if(start.charAt(i) == end.charAt(i)){
        n++;
      }
    }
      
    return n == start.length()-1 ? true : false;
  }
}
