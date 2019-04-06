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



//using sorting
public class Solution {
    public boolean isSubsequence(String x, String y) {
        int j = 0;
        for (int i = 0; i < y.length() && j < x.length(); i++)
            if (x.charAt(j) == y.charAt(i))
                j++;
        return j == x.length();
    }
    public String findLongestWord(String s, List < String > d) {
        Collections.sort(d, new Comparator < String > () {
            public int compare(String s1, String s2) {
                return s2.length() != s1.length() ? s2.length() - s1.length() : s1.compareTo(s2);
            }
        });
        for (String str: d) {
            if (isSubsequence(str, s))
                return str;
        }
        return "";
    }
}
