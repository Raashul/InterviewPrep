/*
Write an efficient algorithm that searches for a value in an m x n matrix.
This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
  0  1  2    3
  4  5  6   3
  8  9  10  11
  12 13 14  15
  16 17 18   19

O(n+m)
each turn eleminates a row or a column

*/

public boolean checkTarget(int[][] matrix, int target){
  if(matrix.length == 0 || matrix[0].length == 0) return false;

  int rows = 0, cols = matrix[0].length -1;
  while(rows < matrix.length && cols >= 0 ){
    if(matrix[rows][cols] == target){
      return true;
    }
    else if(matrix[rows][cols] < target){
      rows++;
    }
    else{
      cols--;
    }
  }
  return false;
}
