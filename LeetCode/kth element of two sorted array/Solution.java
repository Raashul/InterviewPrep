
 import java.io.*;
import java.util.*;


 class Main {

  public static void main(String[] args){
    int[] arr = {1,3,5};
    int[] arr1 = {2,10,12,100,140};
    /*
    index = 7
    target = 8
    11, 3,5
            ^
    2,10,12,100,140
             ^
    */

    System.out.println(kthSmallest(arr, arr1, 8));
  }

  public static int kthSmallest(int[] arr, int[] arr1, int target){
    int i =0, j =0, index = 1;

    while(i < arr.length && j < arr1.length){
      if(index == target){
        return arr[i] > arr1[j] ? arr1[j] : arr[i];
      }
      if(arr[i] < arr1[j]){
        i++;
        index++;
      }
      else{
        j++;
        index++;
      }
    }

    while(i < arr.length){
      index++;
      if(index == target){
        return arr[i];
      }
    }

    while(j < arr1.length){
      index++;
      j++;
      if(index == target){
        return arr1[j];
      }
    }
    return -1;
  }


}
