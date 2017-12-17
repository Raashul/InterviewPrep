// Find the contiguous subarray within an array (containing at least one number)
//which has the largest product.

// For example, given the array [2,3,-2,4],
// the contiguous subarray [2,3] has the largest product = 6.


public int maxProductSubArray(int[] arr){
  if(arr.length == 0)
    return 0;

  int max, min = arr[0];
  int result = max;

  for(int i =1; i < arr.length; i++){
    int temp = max;
    max = Math.max(Math.max(max * arr[i], min * arr[i]), num[i]);
    min = Math.min(Math.min(temp * arr[i], min * arr[i]), num[i]);

    if(max > result){
      result = max;
    }
  }
  return result;
}

