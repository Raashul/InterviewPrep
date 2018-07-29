/*
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array),
some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

int[] arr = [1,2,1];

1.Brute Force -
  O(n^2)  ***
  O(1)

2. Sorting
  O(n log n) ***
  O(1)

3. HashMap/Hashsets

  O(n)
  O(n) ****

4. Encoding

  O(n)
  O(1)


*/

//HashMap method

import java.util.*;

class Main {
  public static void main(String[] args) {
    int[] arr = {4,3,2,7,8,2,3,1};
    System.out.println(findDuplicates(arr));
  }

  public static ArrayList<Integer> findDuplicates(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    ArrayList<Integer> res = new ArrayList<Integer>();
    for(int num: nums){
      if(!map.containsKey(num)){
        map.put(num, 1);
      }
      else{
        int count = map.get(num);
        map.put(num, count+1);
      }
    }

    for (Map.Entry<Integer, Integer> item : map.entrySet()) {

      int key = item.getKey();
      int value = item.getValue();
        System.out.println(value);
       if(value == 2){
        res.add(key);
      }
    }
    return res;
  }
}


//Encoding method
ArrayList<Integer> findDuplicates(int[] arr){


  for(int i =0; i < arr.length; i++){

    int index = Math.abs(arr[i]) - 1;
    if(arr[index] < 0){
      result.add(Math.abs(arr[i]));
    }
    else{
      arr[index] = arr[index] * -1;
    }
  }

  for(int i =0; i < arr.length; i++){
  	arr[i] = Math.abs(arr[i]);
  }

 return result;


}
