import java.util.HashMap;
import java.util.Map;

public class longestSubString{

  public static int lengthOfLongestString(String s){
    int length = s.length(), count =0;

    Map<Character, Integer> map = new HashMap<>();

    for(int i=0, j=0; j < length; j++){
      char c = s.charAt(j);
      if(map.containsKey(c)){
        i = Math.max(map.get(c), i);
      }
      count = Math.max(count, j - i + 1);


        map.put(c, j + 1);
    }
    return count;

  }


  public static int lengthOfLongestString1(String s){

    int i=0, j =0, max = 0;
    HashSet<Character> set = new HashSet<Character>();

    while(j < s.length()){
      if(!set.contains(s.charAt(j))){
        set.add(s.charAt(j));
        j++;
        max = Math.max(max, set.size());
      }
      else{
        set.remove(set.remove(i));
        i++;
      }
    }
    return max;

  }



  public static void main(String [] args){
    System.out.println(lengthOfLongestString("abcabcbb"));
    System.out.println(lengthOfLongestString1("abcabcbb"));

  }

}
