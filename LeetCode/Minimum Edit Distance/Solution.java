/*
Given two words word1 and word2, find the minimum number of operations required to convert word1
to word2.

https://www.youtube.com/watch?v=We3YDTzNXEk
*/

class Solution {
  public int minDistance(String word1, String word2) {
    int length1 = word1.length();
    int length2 = word2.length();

    int[][] dp = new int[length1+1][length2+1];

    for(int i =0; i <= length1; i++){
      dp[i][0] = i;
    }
    for(int i =0; i <= length2; i++){
      dp[0][i] = i;
    }

    for(int i =0; i < length1; i++){
      for(int j =0; j < length2; j++){
        if(word1.charAt(i) == word2.charAt(j)){
          dp[i+1][j+1] = dp[i][j];
        }
        else{
          int left = dp[i+1][j];
          int diagonal = dp[i][j];
          int up = dp[i][j+1];
          dp[i+1][j+1] = left < diagonal ? (left < up ? left : up) : (diagonal < up ? diagonal : up);
          dp[i+1][j+1]++;
        }
      }
    }

    return dp[length1][length2];

  }
}
