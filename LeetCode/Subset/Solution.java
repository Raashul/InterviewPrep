

/*
Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
*/

class Solution {
  public static void main(String[] args){
    
    int[] nums = {1,2,3};
    ArrayList<ArrayList<Integer>> result = findSubset(nums);    
    System.out.println(result);
  }
  
  public static ArrayList<ArrayList<Integer>> findSubset(int[] nums){
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    populateList(nums, result, new ArrayList<Integer>(), 0);
    return result;
  }
  
  public static void populateList(int[] nums, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> tempList, int start){
    
    /*
      Check dulicate
      
      if(!result.contains(new ArrayList<>(tempList))){
       result.add(new ArrayList<>(tempList));

      }
    */
    result.add(new ArrayList<>(tempList));

    
    for(int i = start; i < nums.length; i++){
      tempList.add(nums[i]);
      populateList(nums, result, tempList, i+1);
      tempList.remove(tempList.size()-1);
    }
  }
}



/*
Given a collection of integers that might contain duplicates, nums, return all possible
subsets (the power set).

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,2], a solution is:

*/

public static void uniqueSubsets(String original, StringBuilder current,
 ArrayList<String> myList, int index)
{
    current.append(original.charAt(index));

    myList.add(current.toString());


    for(int i=index+1; i<original.length(); ++i)
        uniqueSubsets(original, current, myList, i);

    current.deleteCharAt(current.toString().length()-1);
}

//"rum" there are eight: "r", "ru", "rum", "u", "um", "m", "rm", "". 
