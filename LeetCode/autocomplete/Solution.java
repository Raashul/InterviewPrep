public class Autocomplete{
  private class Node{
    String prefix;
    HashMap<Character, Node> children = new HashMap<>();
    boolean isWord;

    private Node(String prefix){
      this.prefix = prefix;
      this.children = new HashMap<Character, Node()>;

    }
  }

}

private Node trie;

public Autocomplete(String[] dict){
  trie = new Node("");
  for(String s: dict) insertWord(s);
}

private void insertWord(String s){
  Node curr = trie;
  for(int i =0; i < s.length(); i++){
    if(!curr.children.containsKey(s.charAt(i))){
      curr.children.put(s.charAt(i), new Node(s.substring(0,i+1)))
    }
    curr = curr.children.get(s.charAt(i));
    if(i==s.length()-1)
      curr.isWord = true;

  }
}

public List<String> getWordsForPrefix(String pre){
  List<String> results = new LinkedList<String>();

  Node curr = trie;
  for(char c: pre.toCharArray()){
    if(curr.children.containsKey(c)){
      curr = curr.children.get(c);
    }
    else{
      return result;
    }
  }
  findAllChildWords(curr,results);
  return results;
}

private void findAllChildWords(Node n, List<String> results){
  if(n.isWord)
    results.add(n.prefix);
  for(char c: n.children.keySet()){
    findAllChildWords(n.children.get(c), results);
  }
}
