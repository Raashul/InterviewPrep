
 import java.io.*;
import java.util.*;
import java.util.Arrays;



 class Main {

  public static void main(String[] args){
    int[] arr = {1,2,-5,1,2,-1};
    System.out.println(zeroSubArr(arr));
  }

  public static int[] zeroSubArr(int[] arr){
    if(arr.length ==0){
      return null;
    }
    int sum = 0;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for(int i =0; i <= arr.length; i++){
      Integer oldIndex = map.get(sum);

      if(oldIndex == null && i == arr.length){
        return null;
      }
      else if(oldIndex == null){
        map.put(sum, i);
        sum += arr[i];
      }
      else{
        int[] a =  Arrays.copyOfRange(arr, oldIndex, i);
        return a;
      }
    }
    return null;
  }

}
