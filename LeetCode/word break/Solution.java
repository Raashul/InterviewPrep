public static boolean wordBreak(String str, ArrayList<String> dict){
  boolean[] dp = new boolean[str.length()+1];
  dp[0] = true;

  for(int i =1; i <= str.length(); i++){
    for(int j = 0; j < i; j++){
      if(dp[j] && dict.contains(str.substring(j,i))){
        dp[i] = true;
        break;
      }
    }
  }
  return dp[str.length()];
}


//wont work for all cases
//dict - ['leetcode', 'leet']
// s = 'leetcode'
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int i = 0;
        int length = s.length();
        int j = i+1;
        Boolean[] dp = new Boolean[length];
        
        while(j < length && i < j){
            String sub = s.substring(i, j+1);            
            if(!wordDict.contains(sub)){
                dp[j] = false;
                j++;
            }
            else{
                dp[j] = true;
                i = j+1;
                j = i+1;
            }
        }
        return dp[length-1];
    }
}