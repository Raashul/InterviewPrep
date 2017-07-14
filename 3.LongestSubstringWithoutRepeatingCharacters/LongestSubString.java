import java.util.HashMap;
import java.util.Map;

public class longestSubString{

  public static int lengthOfLongestString(String s){
    int length = s.length(), count =0;

    Map<Character, Integer> map = new HashMap<>();

    for(int i=0, j=0; j < length; j++){
      char c = s.charAt(j);
      if(map.containsKey(c)){
        System.out.println("key "  + c + " " + map.get(c));
        i = Math.max(map.get(c), i);
      }
        count = Math.max(count, j - i + 1);
      System.out.println("key " + c + " index " + (j+1));

        map.put(c, j + 1);
    }
    return count;

  }
  
  public static void main(String [] args){
    System.out.println(lengthOfLongestString("abcabcbb"));
    System.out.println(lengthOfLongestString("bbbbb"));

  }
  

}
