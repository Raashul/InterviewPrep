class Solution {
  public String findLongestWord(String s, List<String> d) {
    if(d.size() == 0 || s.length() == 0) return "";
    int max = 0;
    String res = "";
    for(String str: d){
      if(isSubsequence(str, s)){
        if(str.length() > max || str.length() == max && str.compareTo(res) < 0){
          max = str.length();
          res = str;
        }
      }
    }
    return res;
  }
  
  public boolean isSubsequence(String str, String word){
    int indexOfWord = 0;
    int indexOfStr = 0;
    while(indexOfStr < str.length() && indexOfWord < word.length() ){
      if(word.charAt(indexOfWord) == str.charAt(indexOfStr)){
        indexOfStr++;
      }
      indexOfWord++;
    }
    return indexOfStr == str.length() ? true : false;
  }
}