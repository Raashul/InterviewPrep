class Solution {
  public int[][] generateMatrix(int n) {
    
    if(n == 0) return new int[n][n];
    
    int[][] res = new int[n][n];
    
    int rowBegin = 0;
    int colBegin = 0;
    int colEnd = n-1;
    int rowEnd = n-1;
    int curr = 1;
    
    while(rowBegin <= rowEnd && colBegin <= colEnd){
      //traverse right
      for(int i = colBegin; i <= colEnd; i++){
        res[rowBegin][i] = curr++;
      }
      
      //traverse down
      for(int i = rowBegin + 1; i <= rowEnd; i++){
        res[i][colEnd] = curr++;
      }
      
      if(rowBegin < rowEnd && colBegin < colEnd){
        //traverse left
        for(int i = colEnd -1; i > colBegin; i--){
          res[rowEnd][i] = curr++;
        }
        
        //traverse up
        for(int i = rowEnd; i > rowBegin; i--){
          res[i][colBegin] = curr++;
        }
      }
    
      rowBegin++;
      colBegin++;
      rowEnd--;
      colEnd--; 
    }
    
    return res;

  }
}