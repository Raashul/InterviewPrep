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
