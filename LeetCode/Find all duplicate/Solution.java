/*

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



// [1,2,1,3,3]
    index = 0
    -1,2,1,3,3
      index = 1
      -1,-2,1,3,3
      index = 0
      result = [1]
      index = 2
      -1,-2,-1,3
      index = 2
      result = [1,3]
// [1,2,3]

ArrayList<Integer> findDuplicates(int[] arr){
  
  HashMap<Integer> hash = new HashMap<Integer>();
  
  for(int i =0; i < arr.length; i++){
    
    int index = Math.abs(i) - 1;
    
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