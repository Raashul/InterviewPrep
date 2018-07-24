/*
Given an array of integers of size ‘n’.
Our aim is to calculate the maximum sum of ‘k’
consecutive elements in the array.

Input  : arr[] = {100, 200, 300, 400}
         k = 2
Output : 700

Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}
         k = 4
Output : 39
We get maximum sum by adding subarray {4, 2, 10, 23}
of size 4.

Input  : arr[] = {2, 3}
         k = 3
Output : Invalid
There is no subarray of size 3 as size of whole
array is 2.
*/

public class Solution {

  public static void main(String[] args){
    int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
    System.out.println(maxSum(arr, 4));
  }

  public static int maxSum(int[] arr, int window){
  int length = arr.length;
  if(length < window){
    return -1;
  }
  int res = 0;
  int windowSum = 0;

  for(int i =0; i < window; i++){
    windowSum += arr[i];
    res = windowSum;
  }
  for(int i = window; i < length; i++){
    /*
    As we slide our window by unit index
    Add the right element to our sum
    Substract the left element from the sum
    */
    windowSum += arr[i];
    windowSum -= arr[i-window];
    res = Math.max(res, windowSum);
  }
  return res;

}


}
