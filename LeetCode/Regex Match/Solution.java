class Main {
  public static void main(String[] args) {
    System.out.println(matchRegex("aab", "c*a*b"));
  }
  public static boolean matchRegex(String text, String pattern){
    char[] chrText = text.toCharArray();
    char[] chrPattern = pattern.toCharArray();

    boolean[][] dp = new boolean[chrText.length +1][chrPattern.length +1];
    dp[0][0] = true;


    for(int j =1; j < dp[0].length; j++){
      if(chrPattern[j-1] == '*'){
        dp[0][j] = dp[0][j-2];
      }
    }

    for(int i =1; i < dp.length; i++){
      for(int j =1; j < dp[0].length; j++){
        if(chrText[i-1] == chrPattern[j-1] || chrPattern[j-1] == '.'){
          dp[i][j] = dp[i-1][j-1];
        }
        else if(chrPattern[j-1] == '*'){
          dp[i][j] = dp[i][j-2];
          if(chrPattern[j-2] == '.' || chrPattern[j-2] == chrText[i-1]){
            dp[i][j] = dp[i][j] | dp[i-1][j];
          }
        }
        else{
          dp[i][j] = false;
        }
      }
    }

    return dp[chrText.length][chrPattern.length];



  }
}
