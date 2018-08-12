/*
Longest increasing subarray
Given an array containing n numbers. The problem is to find the length of the longest contiguous subarray
 such that every element in the subarray is strictly greater than its previous element in the same
 subarray. Time Complexity should be O(n).
 
*/
class Main {
  public static void main(String[] args) {
    int[] arr = {12, 13, 1, 5, 4, 7, 8, 10, 10, 11};
    /*
                                    ^
                 max = 5
                 len = 5
                 index = 6 - 5 + 1 = 2
                 i = 6
    */
    System.out.println(longestIncreasingSubArray(arr));
  }

  public static int longestIncreasingSubArray(int[] arr){
    int max = 0;
    int maxIndex = 0;
    int len = 1;
    if(arr.length == 0)
      return max;

    for(int i =0; i < arr.length-1; i++){
      if(arr[i] < arr[i+1]){
        len++;
      }
      else{
        max = Math.max(max, len);
        maxIndex = i - max + 1;
        len = 1;
      }
    }

    for(int i = maxIndex; i < max + maxIndex; i++){
      System.out.print(arr[i] + " ");

    }
      System.out.println();
    return max;
  }
}
