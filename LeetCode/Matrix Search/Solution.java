/*

  0  1  2    3
  4  5  6    7
  8  9  10  11
  12 13 14  15
  16 17 18   19 


*/

public boolean checkTarget(int[] arr, int target){
  
  if(arr== null || arr.length == 0)
    return false;
  
  int rows = 0;
  int cols = arr[0].length;
  
  while(rows <= arr.length && cols >=0){
    
    if(arr[rows][cols] == target)
      return true;
    else if(arr[rows][cols] < target){
      row++;
    }
    else{
      cols--;
    }
  }
  return true;

}