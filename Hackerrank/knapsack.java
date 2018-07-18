Time Complexity: O(nW) where n is the number of items and W is the capacity of knapsack.


class Main {
  public static void main(String[] args) {
    int val[] = new int[]{60, 100, 120}; 
    int wt[] = new int[]{10, 20, 30};
    int  W = 50;
    int n = val.length;
    System.out.println(knapSack(W, wt, val, n));
  }

  static int knapSack(int capacity, int[] weights, int[] values, int numberOfItems){
    int[][] temp = new int[numberOfItems+1][capacity+1];
    for(int i=0; i <= numberOfItems; i++){
      for(int j=0; j <= capacity; j++){
        //no more capacity or no more items
        if(i==0 || j==0){
          temp[i][j] = 0;
        }
        else if(weights[i-1] <= j){
          int tmp1 = values[i-1] + temp[i-1][j-weights[i-1]];
          int temp2 =  temp[i-1][j];
          temp[i][j] = Math.max(tmp1, tmp2);
        }
        else{
          temp[i][j] = temp[i-1][j];
        }
      }
    }
    return temp[numberOfItems][capacity];
  }


 
}