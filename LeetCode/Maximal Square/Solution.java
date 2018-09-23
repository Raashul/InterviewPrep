public class Solution{

  public static void main(String[] args){

      int M[][] =  {{0, 1, 1, 0, 1},
                      {1, 1, 0, 1, 0},
                      {0, 1, 1, 1, 0},
                      {1, 1, 1, 1, 0},
                      {1, 1, 1, 1, 1},
                      {0, 0, 0, 0, 0}};

    System.out.println(maxOnes(M));
  }

  public static int maxOnes(int[][] arr){
    int rows = arr.length;
    int cols = rows > 0 ? arr[0].length : 0;
    int squares = 0;

    int[][] dp = new int[rows + 1][cols + 1];


    for(int i = 1; i <= rows; i++){
      for(int j = 1; j <= cols; j++){
        if(arr[i-1][j-1] == 1){
          dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
          squares = Math.max(squares, dp[i][j]);
        }
      }
    }
    return squares;
  }

}
