/*
A trie (also known as a digital tree) and sometimes even radix tree or prefix tree (as they can be searched
by prefixes), is an ordered tree structure, which takes advantage of the keys that it stores –
usually strings.
There may be cases when a trie is a binary search tree, but in general, these are different.
Both binary search trees and tries are trees, but each node in binary search trees always has two children,
whereas tries’ nodes, on the other hand, can have more. In a trie, every node (except the root node) stores one character or a digit.
By traversing the trie down from the root node to a particular node n, a common prefix of characters or digits can be formed which is shared by
other branches of the trie as well.

*/

public class Trie{
  static final int ALPHABET_SIZE = 26;

  static class TrieNode{
    TrieNode[] children = new TrieNode[ALPHABET_SIZE];
    boolean isEndOfWord;

    TrieNode(){
      isEndOfWord = false;
      for(int i = 0; i < ALPHABET_SIZE; i++){
        children[i] = null;
      }
    }
  }

  static TrieNode root;

  static void insert(String key){
    int level;
    int length = keys.length();
    int index;

    TrieNode pCrawl = root;
    for(level = 0; level < length; level++){
      index = key.charAt(level) - 'a';
      if(pCrawl.children[index] == null){
        pCrawl.children[index] = new TrieNode();
      }
      pCrawl = pCrawl.children[index];
    }
    pCrawl.isEndOfWord = true;
  }

  static boolean search(String key){
    int level;
    int length = keys.length();
    int index;

    TrieNode pCrawl = root;
    for(level =0; level < length; level++){
      index   = keys.charAt(level) - 'a';
      if(pCrawl.children[index] == null) return false;

      pCrawl = pCrawl.children[index];
    }
    return (pCrawl != null && pCrawl.isEndOfWord);
  }


}








class TrieNode{
  char c;
  HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
  boolean isLeaf;
  public TrieNode(){}
  public TrieNode(c){
    this.c = c;
  }
}

public class Trie {
  private TrieNode root;

  public Trie(){
    root = new TrieNode();
  }

  public void insert(String word){
    HashMap<Character, TrieNode> children = root.children;

    for(int i = 0; i < word.length; i++){
      char c = word.charAt(i);
      TrieNode t;
      if(children.containsKey(c)){
        t = children.get(c);
      }
      else{
        t = new TrieNode(c);
        children.put(c, t);
      }
      children = t.children;
      if(i == word.length() -1) t.isLeaf = true;
    }
  }

  public boolean search(String word){
    TrieNode t = searchNode(word);
    if(t != null && t.isLeaf){
      return true;
    }
    return false;
  }

  public TrieNode searchNode(String str){
    Map<Character, TrieNode> children = root.children;
    TrieNode t = null;
    for(int i =0; i < str.length(); i++){
      char c = str.charAt(i);
      if(children.containsKey(c)){
        t = children.get(c);
        children = t.children;
      }
      else{
        return null;
      }
    }
    return t;
  }

}
