// Given a string and dictionary HashSet, write a function to determine
// the minimum number of characters to delete to make a word
//
// dict : ["a", "aa", "aaa"]
// query: 'abc'
//
// output: 2


import java.util.*;

class Solution{
  public static HashSet<String> dictionary = new HashSet<String>();
  //Set st = new HashSet(Arrays.asList("bat", "nerd","term","meant","one","dear"));

  public Solution(){
    dictionary.add("a");
    dictionary.add("aa");
    dictionary.add("aaa");
  }

  public static void main(String[] args){
    Solution s = new Solution();
    String query = "abc";

    System.out.println(s.deleteChars(dictionary, query));

  }

 int deleteChars(HashSet<String> dictionary, String query){

    if(query.length() == 0) return -1;

    Queue<String> queue = new LinkedList<>();
    HashSet<String> hash = new HashSet<>();

    queue.add(query);
    hash.add(query);

    while(!query.isEmpty()){
      String s = queue.remove();
      hash.remove(s);

      if(dictionary.contains(s)) return query.length() - s.length();

      for(int i =0; i < s.length(); i++){
        String sub = s.substring(0, i) + s.substring(i+1, s.length());
        if(!hash.contains(sub)){
          queue.add(sub);
          hash.add(sub);
        }
      }


    }

    return -1;

  }

}
