import java.util.*;

class Node{
  String prefix;
  HashMap<Character, Node> children = new HashMap<>();
  boolean isWord;
  Node(String prefix){
    this.prefix = prefix;
    this.children = new HashMap<Character, Node>();
  }
}

class Main {
  static Node trie;
  public static void main(String[] args) {
    trie = new Node("");
    String[] dict = {"abc", "bcd", "ac", "ab", "bcde"};
    for(String s: dict) insertWord(s);

    System.out.println(getWordsForPrefix("ab"));
  }

  public static void insertWord(String s){
    Node curr = trie;
    for(int i =0; i < s.length(); i++){
      if(!curr.children.containsKey(s.charAt(i))){
        curr.children.put(s.charAt(i), new Node(s.substring(0, i+1)));
      }
      curr = curr.children.get(s.charAt(i));
      if(i == s.length() -1) curr.isWord = true;
    }
  }

  public static ArrayList<String> getWordsForPrefix(String pre){
    ArrayList<String> results = new ArrayList<String>();
    Node curr = trie;
    for(char c: pre.toCharArray()){
      if(curr.children.containsKey(c)){
        curr = curr.children.get(c);
      }
      else{
        return results;
      }
    }
    findAllChildWords(curr, results);
    return results;
  }

  public static void findAllChildWords(Node n, ArrayList<String> results){
    if(n.isWord){
      results.add(n.prefix);
    }
    for(char c: n.children.keySet()){
      findAllChildWords(n.children.get(c), results);
    }
  }
}
