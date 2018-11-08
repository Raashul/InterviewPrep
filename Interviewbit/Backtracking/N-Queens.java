import java.util.*;

class Main {
  public static void main(String[] args){
    System.out.println(solveNQueens(4));
  }
  public static ArrayList<ArrayList<String>> solveNQueens(int a) {
    char[][] board = new char[a][a];
    for(int i =0; i < a ; i++){
      for(int j = 0; j < a; j++){
        board[i][j] = '.';
      }
    }
    ArrayList<ArrayList<String>> res = new ArrayList<>();
    dfs(board, 0, res);
    return res;
  }
  
  public static void dfs(char[][] board, int colIndex, ArrayList<ArrayList<String>> res){
    if(colIndex == board.length){
      res.add(constructBoard(board));
      return;
    }
    
    for(int i =0; i < board.length; i++){
      if(validate(board, i, colIndex)){
        board[i][colIndex] = 'Q';
        dfs(board, colIndex+1, res);
        board[i][colIndex] = '.';
      }
    }
  }
  
  public static boolean validate(char[][] board, int rows, int cols){
    for(int i =0; i < board.length; i++){
      for(int j =0; j < cols; j++){
        if(board[i][j] == 'Q' && (Math.abs(rows-i) == Math.abs(cols-j) || rows == i) )
        // if(board[i][j] == 'Q' && (rows + j == cols + i || rows + cols == i + j || rows == i) )
          return false;
      }
    }
    return true;
  }
  
  public static ArrayList<String> constructBoard(char[][] board){
    ArrayList<String> res = new ArrayList<>();
    for(int i = 0; i < board.length; i++){
      String s = new String(board[i]);
      res.add(s);
    }
    return res;
  }
  
}
