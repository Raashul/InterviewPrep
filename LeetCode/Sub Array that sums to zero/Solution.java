public class Solution{

// 1, 2, -5,  1, 2, -1
// 

// i =5
//oldIndex = 1
//map = [0:0, 1: 1, 3:2, -2:3, -1: 4, 1:5 ]
//sum = 1

//arr = {2,-5,1,2};

int[] checkSum(int [] arr){
  
  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
  int sum = 0;
  
  for(int i =0; i <= arr.length; i++){
    int oldIndex = map.get(sum);
    
    if(oldIndex == null && i == arr.length){
      return null;
    }
    
    if(oldIndex == null){
      map.put(sum, i);
      sum += arr[i];
    }
    else{
      return Arrays.copyofRange(arr, oldIndex, i);
    }
  }
  return null;
  
}

}