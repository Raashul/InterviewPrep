class Solution {
  public boolean exist(char[][] board, String word) {
    int rows = board.length;
    int cols = board[0].length;

    for(int i =0; i < rows; i++){
      for(int j =0; j < cols; j++){
        if(dfsHelper(board, word, i, j, 0))
          return true;
      }
    }
    return false;
  }

  public boolean dfsHelper(char[][] board, String word, int rows, int cols, int index ){
    if(rows >= board.length || rows < 0 || cols >= board[0].length || cols < 0){
      return false;
    }
    
    if(word.charAt(index) == board[rows][cols]){
      char temp = board[rows][cols];
      board[rows][cols] = '#';
      
      if(index == word.length()-1){
        return true;
      }
      
      else if( dfsHelper(board, word, rows, cols+1, index+1) || dfsHelper(board, word, rows+1, cols, index+1) || dfsHelper(board, word, rows-1, cols, index+1) || dfsHelper(board, word, rows, cols-1, index+1) ){
       
        return true;
      }
      board[rows][cols] = temp; 
    }
    return false;
  }

}