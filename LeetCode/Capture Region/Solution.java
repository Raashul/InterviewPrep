public class Solution {


    public void solve(ArrayList<ArrayList<Character>> board) {
        int m = board.size();
        if (m == 0) {
            return;
        }
        int n = board.get(0).size();

        //mark boundary O as 1
        for (int i=0; i<m; i++) {
            if (board.get(i).get(0) == 'O') {
                board.get(i).set(0, '1');
                mark(board, i, 0);
            }

            if (board.get(i).get(n-1) == 'O') {
                board.get(i).set(n-1, '1');
                mark(board, i, n-1);
            }
        }
        for (int i=0; i<n; i++) {
            if (board.get(0).get(i) == 'O') {
                board.get(0).set(i, '1');
                mark(board, 0, i);
            }

            if (board.get(m-1).get(i) == 'O') {
                board.get(m-1).set(i, '1');
                mark(board, m-1, i);
            }
        }

        //mark O as x
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (board.get(i).get(j) == 'O') {
                    board.get(i).set(j, 'X');
                }
            }
        }

        //mark 1 as O
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (board.get(i).get(j) == '1') {
                    board.get(i).set(j, 'O');
                }
            }
        }
    }
}


class Solution {
  public void solve(char[][] board) {
    if(board == null || board.length==0)
        return;

    int rows = board.length;
    int cols = board[0].length;

    for(int i =0; i < rows; i++){
      if(board[i][0] == 'O'){
        checkBoundaries(board, i, 0);
      }
      if(board[i][cols-1] == 'O'){
        checkBoundaries(board, i, cols-1);
      }
    }

    for(int i =0; i < cols; i++){
      if(board[0][i] == 'O'){
        checkBoundaries(board, 0, i);
      }
      if(board[rows-1][i] == 'O'){
        checkBoundaries(board, rows-1, i);
      }
    }

    for(int i =0; i < rows; i++){
      for(int j =0; j < cols; j++){
        if(board[i][j] == 'O')
          board[i][j] = 'X';
        if(board[i][j] == '#')
          board[i][j] = 'O';
      }
    }

  }

  public void checkBoundaries(char[][] board, int rows, int cols){
    int m = board.length;
    int n = board[0].length;

    if(rows < 0 || rows >= m || cols < 0 || cols >= n || board[rows][cols] != 'O')
      return;

    board[rows][cols] = '#';

    checkBoundaries(board, rows-1, cols);
    checkBoundaries(board, rows+1, cols);
    checkBoundaries(board, rows, cols-1);
    checkBoundaries(board, rows, cols+1);

  }

}
