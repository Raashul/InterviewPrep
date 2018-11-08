public class Solution{
  int MAX = 256;
  class TrieNode {
    int count =1;
    TrieNode(){
      TrieNode[] child = new TrieNode[MAX];
      for(int i =0; i < MAX; i++){
        child[i] = null;
      }
    }
  }

  public ArrayList<String> shortestPrefix(ArrayList<String> arr){
    ArrayList<String> res = new ArrayList<>();
    TrieNode root = new TrieNode();
    root.count = 0;
    if(arr != null){
      for(String s: arr){
        insert(s, root);
      }

      for(String str: arr){
        int length = str.length();
        String pre = "";
        TrieNode curr = root;
        for(int i =0; i < length; i++){
          int charVal = str.charAt(i);
          pre = pre + (char) charVal;
          if(curr.child[charVal].child == 1){
            res.add(pre);
            break;
          }
          else{
            curr = curr.child[charVal];
          }
        }

      }
      return res;
    }
   
  }

  public void insert(String str, TrieNode root){
    if(str != null){
      TrieNode curr = root;
      for(int i =0; i < str.length(); i++){
        int charVal = str.charAt(i);
        if(curr.child[charVal] == null){
          curr.child[charVal] = new TrieNode();
        } else {
          curr.child[charVal].count++;
        }
        curr = curr.child[charVal];
      }

    }

  }



}