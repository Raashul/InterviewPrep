Each element is visited once only. So time is O(m*n).



class Solution {
  public int numIslands(char[][] grid) {
    if(grid.length == 0 || grid[0].length == 0) return 0;
    int rows = grid.length;
    int cols = grid[0].length;
    int count = 0;

    for(int i =0; i < rows; i++){
      for(int j =0; j < cols; j++){
        if(grid[i][j] == '1'){

          count++;
          checkChildren(grid, i, j);
        }
      }
    }
    return count;
  }

  public void checkChildren(char[][] grid, int rows, int cols){
     int m=grid.length;
    int n=grid[0].length;

    //check base case
    if(rows < 0 || rows >= m || cols >= n || cols < 0 || grid[rows][cols] != '1')
      return;

    grid[rows][cols] = '0';
    checkChildren(grid, rows-1, cols);
    checkChildren(grid, rows+1, cols);
    checkChildren(grid, rows, cols-1);
    checkChildren(grid, rows, cols+1);



  }


}
